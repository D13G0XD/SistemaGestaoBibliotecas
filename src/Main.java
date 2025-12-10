import model.Book;
import services.book.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();
        Scanner input = new Scanner(System.in);

        int option = -1;

        while (option != 0) {

            System.out.println("----- Bem vindo ao sistema de gerenciamento de livros! -----\n");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Procurar livro");
            System.out.println("4 - Listar todos os livros cadastrados");
            System.out.println("5 - Checar Status de um livro");
            System.out.println("6 - Gerenciar usuários");
            System.out.println("0 - Sair");
            System.out.print("\nDigite uma das opções acima: ");
            option = input.nextInt();

            if (option == 1) {
                System.out.print("Digite o nome do livro: ");
                String title = input.next();
                System.out.print("Digite a data de lançamento: ");
                String releaseDate = input.next();
                System.out.print("Digite o código de fabricante: ");
                int bookId = input.nextInt();
                boolean isLent = false;
                Book book = new Book(title, releaseDate, bookId, isLent);

                service.addBook(book);

            }

        }


    }
}