package messenger.api;

public interface IUser {
    int getId(String username);
    String getUsername();
    void changePassword(String username, String oldPassword, String newPassword);
    void addMessage(String message, String username);
}
