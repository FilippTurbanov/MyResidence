package messenger;

import messenger.api.IUser;

public class User implements IUser {
    public final String username;
    Validation validation = new Validation();
    Chat chat = new Chat();

    User(String username) {
        this.username = username;
    }

    @Override
    public int getId(String username) {
        return validation.idList.get(username);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        validation.changePassword(username, oldPassword, newPassword);
    }

    @Override
    public void addMessage(String message, String username) {
        username = getUsername();
        chat.addMessage(message, username);
    }
}
