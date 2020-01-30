package messenger.api;

import messenger.data.TextMessage;

public interface IUser {
    int getId();
    String getUsername();
    String getPassword();
    void changePassword(String oldPassword, String newPassword);
    void addMessage(TextMessage message);
    void authorization() throws IllegalAccessException;
}
