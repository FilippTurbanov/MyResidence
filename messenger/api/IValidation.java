package messenger.api;

import messenger.User;

public interface IValidation {
    boolean userRegistrationCheck(String username);
    boolean userValidationCheck(String username);
    boolean idCheck(int id);
    boolean passwordRegistrationCheck(String password);
    boolean passwordValidationCheck(String username, String password);
    void addNewUser(String username, String password);
    void authorization(User user) throws IllegalAccessException;
}
