package src.patterns.chain;

public class Director extends RequestHandler {
    public void handleRequest(int daysRequested) {
        if (daysRequested > 14) {
            System.out.println("Director approved the request for " + daysRequested + " days.");
        }
    }
}