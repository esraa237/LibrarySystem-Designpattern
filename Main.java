import src.core.*;
import src.patterns.decorator.*;
import src.patterns.proxy.*;
import src.patterns.chain.*;
import src.patterns.facade.*;
import src.patterns.adapter.*;
import src.patterns.observer.*;
import src.patterns.chain.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        LibraryService.getInstance().manageBooks();

        // Factory
        Book ebook = BookFactory.createBook("ebook");
        ebook.displayInfo();

        // Decorator
        BaseBook normal = new NormalBook();
        BaseBook premium = new PremiumBookDecorator(normal);
        System.out.println("Normal borrow days: " + normal.getBorrowDays());
        System.out.println("Premium borrow days: " + premium.getBorrowDays());

        // Proxy
        IEBookAccess proxy = new PremiumEBookProxy(false);
        proxy.access();

        // Chain of Responsibility
        RequestHandler librarian = new Librarian();
        RequestHandler manager = new Manager();
        librarian.setNext(manager);
        librarian.handleRequest("Borrow Book");

        // Facade
        LibraryFacade facade = new LibraryFacade();
        facade.handleBorrowingRequest();

        // Task 7: Adapter Pattern - Convert external JSON book to internal BookEntity
        ExternalBookJSON external = new ExternalBookJSON("Design Patterns", true, "Erich Gamma", 1994);
        BookEntity converted = BookAdapter.convertFromJSON(external);
        converted.printBookDetails();

        // Task 8: Observer Pattern - Notify users when books become available
        BookNotifier notifier = new BookNotifier("Clean Code");
        notifier.addObserver(new User("Alice"));
        notifier.addObserver(new User("Bob"));
        notifier.notifyAvailability();

        
        // Task 9: Chain of Responsibility Pattern - Librarian → Manager → Director handles request
        RequestHandler librarian = new Librarian();
        RequestHandler manager = new Manager();
        RequestHandler director = new Director();

        librarian.setNext(manager);
        manager.setNext(director);

        librarian.handleRequest(5);   // Librarian
        librarian.handleRequest(10);  // Manager
        librarian.handleRequest(20);  // Director
    }
}
