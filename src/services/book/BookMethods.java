package services.book;

import model.Book;

import java.util.List;

public interface BookMethods {

    Book addBook(Book book);
    Book removeBook(Book book);
    Book searchBook(int id);
    List<Book> listAllBooks();

}
