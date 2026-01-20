package services.user;

import model.User;

public interface ManageUsers {
    User addUsers(User user);
    void removeUsers(String userId);
    void showUsers();
}
