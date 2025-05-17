// Task 5: Chain of Responsibility - Librarian passes request to Manager

package src.patterns.chain;

public class Manager extends RequestHandler {
    public void handleRequest(int daysRequested) {
        if (daysRequested <= 14) {
            System.out.println("Manager approved the request for " + daysRequested + " days.");
        } else if (next != null) {
            next.handleRequest(daysRequested);
        }
    }
}
