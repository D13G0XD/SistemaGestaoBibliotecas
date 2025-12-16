import model.Book;
import services.book.BookService;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();
        Scanner input = new Scanner(System.in);

        int option = -1;

        System.out.println("---- Selecione uma opção -----");

        while (option != 0) {

            System.out.println("----- Bem vindo ao sistema de gerenciamento de livros! -----\n");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Procurar livro");
            System.out.println("4 - Listar todos os livros cadastrados");
            System.out.println("5 - Gerenciar usuários");
            System.out.print("Digite uma das opções acima: ");
            option = input.nextInt();

            switch (option) {

                case 1 -> {
                    System.out.print("Digite o nome do livro: ");
                    String title = input.next();
                    System.out.print("Digite a data de lançamento: ");
                    String releaseDate = input.next();
                    System.out.print("Digite o código de fabricante: ");
                    int bookId = input.nextInt();
                    Book book = new Book(title, releaseDate, bookId);

                    service.addBook(book);


                }

                case 2 -> {
                    System.out.print("Digite o código de fabricante do livro: ");
                    int bookId = input.nextInt();

                    service.removeBook(bookId);

                }
                case 3 -> {
                    System.out.print("\nDigite o código do livro que deseja encontrar: ");
                    int bookId = input.nextInt();
                    Book findBook = service.searchBook(bookId);

                    if (findBook != null) {

                        System.out.println("\nLivro encontrado. Nome do livro: " + findBook.getTitle());

                    }
                }

                case 4 -> {
                    if (service.listAllBooks().isEmpty()) {
                        System.out.println("Não há livros cadastrados\n");
                    } else {
                        System.out.println("Lista dos livros cadastrados: \n");
                        for (Book bookList : service.listAllBooks()) {
                            System.out.println(bookList);
                        }
                    }

                }


                default -> System.out.println("Opção inválida, digite uma das opções acima");


            }

            System.out.print("Deseja continuar? (s/n): ");
            String restart = input.next();

            if (restart.equalsIgnoreCase("s")) {
                option = -1;
            } else {
                option = 0;
            }


        }

    }
}