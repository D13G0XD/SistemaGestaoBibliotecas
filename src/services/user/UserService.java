package services.user;

import model.User;
import java.util.HashMap;
import java.util.Map;

public class UserService implements ManageUsers {

    private final Map<String, User> users = new HashMap<>();


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
    public void removeUsers(String userId) {
        users.remove(userId);
        System.out.println("Usuário removido com sucesso!");


    }

    @Override
    public void showUsers() {

    }

}
