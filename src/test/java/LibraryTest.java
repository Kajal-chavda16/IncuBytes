import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testAddBook() {
        Library library = new Library();
        Book book = new Book("123456789", "Effective Java", "Joshua Bloch", 2008);
        library.addBook(book);

        assertEquals(1, library.getAvailableBooks().size());
        assertTrue(library.getAvailableBooks().contains(book));
    }

    @Test
    void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("123456789", "Effective Java", "Joshua Bloch", 2008);
        library.addBook(book);

        boolean isBorrowed = library.borrowBook("123456789");

        assertTrue(isBorrowed);
        assertFalse(library.getAvailableBooks().contains(book));
    }

    @Test
    void testReturnBook() {
        Library library = new Library();
        Book book = new Book("123456789", "Effective Java", "Joshua Bloch", 2008);
        library.addBook(book);
        library.borrowBook("123456789");

        library.returnBook(book);

        assertTrue(library.getAvailableBooks().contains(book));
    }
}

