
package src.patterns.adapter;

public class ExternalBookJSON {
    public String bookTitle;
    public boolean isBorrowable;
    public String authorName;
    public int year;

    public ExternalBookJSON(String bookTitle, boolean isBorrowable, String authorName, int year) {
        this.bookTitle = bookTitle;
        this.isBorrowable = isBorrowable;
        this.authorName = authorName;
        this.year = year;
    }
}
