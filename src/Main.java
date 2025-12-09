import model.Book;
import services.book.BookService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book("teste1", "12/01/2023", 123, false);

        BookService service = new BookService();
        service.addBook(book);

        System.out.println(service.listAllBooks());



    }
}