package src.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class BookNotifier {
    private List<Observer> observers = new ArrayList<>();
    private String bookTitle;

    public BookNotifier(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAvailability() {
        for (Observer o : observers) {
            o.update(bookTitle);
        }
    }
}
