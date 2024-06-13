
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book newBook = new Book("Basiz atli", "HUqo", "12345", 10, 10);
        library.addBook(newBook);


        try {
            library.updateBook("12345", 34.99);
        } catch (BookNotFound e) {
            System.out.println(e.getMessage());
        }


        try {
            Book foundBook = library.searchByTitle("Basiz atli");
            System.out.println("Tapılan kitab: " + foundBook.getTitle());
        } catch (BookNotFound e) {
            System.out.println(e.getMessage());
        }



    }


}