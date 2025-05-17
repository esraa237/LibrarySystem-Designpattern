// Task 4: Proxy Pattern - Control access to EBooks based on premium status

package src.patterns.proxy;

public class PremiumEBookProxy implements IEBookAccess {
    private boolean isPremium;
    private RealEBook realEBook;

    public PremiumEBookProxy(boolean isPremium) {
        this.isPremium = isPremium;
        this.realEBook = new RealEBook();
    }

    public void access() {
        if (isPremium) realEBook.access();
        else System.out.println("Upgrade to premium to access this EBook.");
    }
}
