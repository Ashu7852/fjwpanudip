
import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

 class BookCollection {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        // Create and add books to the collection
        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book(2, "1984", "George Orwell");
        Book book3 = new Book(3, "Pride and Prejudice", "Jane Austen");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        // Display all book details using a for-each loop
        System.out.println("Book Details:");
        for (Book book : bookList) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println();
        }
    }
}
