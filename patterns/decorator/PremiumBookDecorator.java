// Task 3: Decorator Pattern - Add extra 10 days to borrow without changing book class

package src.patterns.decorator;

public class PremiumBookDecorator extends BaseBook {
    private BaseBook base;

    public PremiumBookDecorator(BaseBook base) {
        this.base = base;
    }

    public int getBorrowDays() {
        return base.getBorrowDays() + 10;
    }
}
