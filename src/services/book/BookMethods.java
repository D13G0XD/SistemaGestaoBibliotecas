package services.book;

import model.Book;

import java.util.List;

public interface BookMethods {

    Book addBook(Book book);
    void removeBook(int bookId);
    Book searchBook(int bookId);
    List<Book> listAllBooks();
    Book showStatus(Book book, boolean status);

}
