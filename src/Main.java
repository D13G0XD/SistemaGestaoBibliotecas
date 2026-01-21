import entities.Book;
import entities.User;
import services.book.BookService;
import services.user.UserService;

import java.time.LocalDate;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();
        UserService userService = new UserService();
        Scanner input = new Scanner(System.in);

        boolean menu = true;

        while (menu) {

            System.out.println("\n----- Bem vindo ao sistema de gerenciamento de livros! -----");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Procurar livro");
            System.out.println("4 - Listar todos os livros cadastrados");
            System.out.println("5 - Gerenciar usuários");
            System.out.println("6 - Sair\n");
            System.out.print("Digite uma das opções acima: ");
            int option = input.nextInt();

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

                } case 5 -> {
                    System.out.println("\n---- Central Usários ----");
                    System.out.println("1 - Cadastrar usuário");
                    System.out.println("2 - Remover usuário");
                    System.out.println("3 - Listar usuários");
                    System.out.println("4 - Voltar\n");
                    System.out.print("Digite a opção que deseja selecionar: ");
                    int userOption = input.nextInt();

                    switch (userOption) {
                        case 1 -> {

                            System.out.print("Digite o seu nome: ");
                            String name = input.next();
                            System.out.print("Digite sua idade: ");
                            int age = input.nextInt();
                            System.out.print("Digite o ID do usuário: ");
                            String id = input.next();
                            LocalDate registerDate = LocalDate.now();

                            User user = new User(name, age, id, registerDate);

                            userService.addUsers(user);


                        }

                        case 2 -> {
                            System.out.println("Digite o ID do usuário: ");
                            String id = input.next();
                            userService.removeUsers(id);

                        }

                        case 3 -> {

                            if (userService.showUsers().isEmpty()) {
                                System.out.println("Não há usuários cadastrados!");
                            } else {

                                for (User userList : userService.showUsers()) {
                                    System.out.println(userList);

                                }

                            }

                        }

                        default -> System.out.println("Digite uma opção válida!");
                    }

                }

                case 6 -> {
                    System.out.print("Deseja sair? (s/n): ");
                    String restart = input.next();

                    if (restart.equalsIgnoreCase("s")) {
                        menu = false;
                    } else {
                        System.out.println("Digite uma opção válida!\n");
                    }

                }


                default -> System.out.println("Opção inválida, digite uma das opções acima");


            }




        }

    }
}