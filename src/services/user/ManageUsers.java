package services.user;

import entities.User;

import java.util.List;

public interface ManageUsers {
    User addUsers(User user);
    void removeUsers(String userId);
    List<User> showUsers();
}
