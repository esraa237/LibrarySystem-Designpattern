package src.patterns.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String bookTitle) {
        System.out.println("Hello " + name + ", the book \"" + bookTitle + "\" is now available!");
    }
}
