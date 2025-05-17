// Task 6: Facade Pattern - Simplify operations like borrow, notify ......

package src.patterns.facade;

public class LibraryFacade {
    private InventoryService inventory = new InventoryService();
    private NotificationService notification = new NotificationService();
    private BorrowingService borrowing = new BorrowingService();

    public void handleBorrowingRequest() {
        inventory.checkAvailability();
        borrowing.borrow();
        notification.notifyUser();
    }
}
