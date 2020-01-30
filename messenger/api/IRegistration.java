package messenger.api;

import messenger.User;

public interface IRegistration {
    User setNewUser(String username, String password);
    int setAndGetId(String username);
}
