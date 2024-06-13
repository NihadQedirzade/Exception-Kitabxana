import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(String serialNumber, double newPrice) throws BookNotFound {
        for (Book book : books) {
            if (book.getSeries_number().equals(serialNumber)) {
                book.setPrice(newPrice);
                return;
            }
        }
        throw new BookNotFound("Kitab tapılmadı!");
    }

    public Book searchByTitle(String title) throws BookNotFound {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new BookNotFound("Kitab tapılmadı!");
    }

    public Book searchByAuthor(String author) throws BookNotFound {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        throw new BookNotFound("Kitab tapılmadı!");
    }

    public void removeBook(String serialNumber) throws BookNotFound {
        for (Book book : books) {
            if (book.getSeries_number().equals(serialNumber)) {
                books.remove(book);
                return;
            }
        }
        throw new BookNotFound("Kitab tapılmadı!");
    }
}
