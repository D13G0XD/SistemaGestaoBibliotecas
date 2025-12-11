package services.book;

import model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService implements BookMethods{
    private Map<Integer, Book> lib = new HashMap<>();

    @Override
    public Book addBook(Book book) {
        if (lib.containsKey(book.getBookId())) {
            System.out.println("Erro: O livro já está cadastrado");
        }
        else{
            System.out.println("Livro cadastrado com sucesso!\n");

        }
        return lib.put(book.getBookId(), book);
    }

    @Override
    public void removeBook(int bookId) {
        if (lib.containsKey(bookId)) {
            lib.remove(bookId);
            System.out.println("Livro removido com sucesso!\n");
        }


    }

    @Override
    public Book searchBook(int bookId) {

        return lib.get(bookId);

    }

    @Override
    public List<Book> listAllBooks() {
        return new ArrayList<>(lib.values());
    }

    @Override
    public Book showStatus(Book book, boolean status) {
        if (book.isStatus()) {

            System.out.println("O livro já está emprestado e não pode ser reservado!");

        }
        System.out.println("O livro pode ser reservado!");
        return null;
    }

}
