package src.patterns.proxy;

public class RealEBook implements IEBookAccess {
    public void access() {
        System.out.println("Accessing real EBook...");
    }
}
