//Task 1
//Create only one LibraryService to manage books.


//Solution
//Use Singleton Pattern to ensures only one instance of LibraryService exists

package src.core;

public class LibraryService {
    private static LibraryService instance = null;

    private LibraryService() {} 

    public static LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

    public void manageBooks() {
        System.out.println("Managing books in LibraryService (Singleton).");
    }
}
