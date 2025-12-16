package services.user;

import model.Book;
import model.User;

public interface ManageUsers {
    User addUsers(User user);
    void removeUsers();
    void showUsers();
}
