package services.user;

import model.User;

import java.util.List;

public interface ManageUsers {
    User addUsers(User user);
    void removeUsers(String userId);
    List<User> showUsers();
}
