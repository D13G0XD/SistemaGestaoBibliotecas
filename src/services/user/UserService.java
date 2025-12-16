package services.user;

import model.Book;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService implements ManageUsers {

    private Map<String, User> users = new HashMap<>();


    @Override
    public User addUsers(User newUser) {

        if (users.containsKey(newUser.getId())) {
            System.out.println("Usuário já cadastrado!");

        } else {
            System.out.println("Usuário cadastrado com sucesso!");
        }
        return users.put(newUser.getId(), newUser);


    }

    @Override
    public void removeUsers() {

    }

    @Override
    public void showUsers() {

    }

}
