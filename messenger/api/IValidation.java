package messenger.api;

public interface IValidation {
    boolean userRegistrationCheck(String username);
    boolean userValidationCheck(String username);
    boolean idCheck(Integer id);
    boolean passwordRegistrationCheck(String password);
    boolean passwordValidationCheck(String username, String password);
    void addNewUser(String username, String password);
    void authorization(String username, String password);
}
