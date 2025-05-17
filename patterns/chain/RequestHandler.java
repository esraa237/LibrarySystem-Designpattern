package src.patterns.chain;

public abstract class RequestHandler {
    protected RequestHandler next;

    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(int daysRequested);
}
