package src.patterns.chain;

public class Librarian extends RequestHandler {
    public void handleRequest(int daysRequested) {
        if (daysRequested <= 7) {
            System.out.println("Librarian approved the request for " + daysRequested + " days.");
        } else if (next != null) {
            next.handleRequest(daysRequested);
        }
    }
}
