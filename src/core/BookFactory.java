//Task 2
//Separate the logic of creating different types of books outside the entire code.


//Solution
//Use Factory Pattern to separate object creation logic and supports easy addition of new book types.

package src.core;

public class BookFactory {
    public static Book createBook(String type) {
        if (type.equalsIgnoreCase("ebook")) return new EBook();
        else if (type.equalsIgnoreCase("physical")) return new PhysicalBook();
        throw new IllegalArgumentException("Unknown book type");
    }
}
