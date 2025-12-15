package services.user;

import model.User;

public interface ManageUsers {
    void addUsers(User user);
    void removeUsers();
    void showUsers();
}
