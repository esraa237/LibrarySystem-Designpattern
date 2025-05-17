package src.patterns.decorator;

public class NormalBook extends BaseBook {
    public int getBorrowDays() {
        return 14; // default
    }
}
