package src.patterns.adapter;

public class BookAdapter {
    public static BookEntity convertFromJSON(ExternalBookJSON externalBook) {
        return new BookEntity(
            externalBook.bookTitle,
            externalBook.isBorrowable,
            externalBook.authorName,
            externalBook.year
        );
    }
}
