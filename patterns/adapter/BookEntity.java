package src.patterns.adapter;

public class BookEntity {
    private String title;
    private boolean borrowable;
    private String author;
    private int publishedYear;

    public BookEntity(String title, boolean borrowable, String author, int publishedYear) {
        this.title = title;
        this.borrowable = borrowable;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publishedYear + ", Borrowable: " + borrowable);
    }
}
