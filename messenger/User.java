package messenger;

import messenger.api.IUser;

public class User implements IUser {
    public final String username;
    Validation validation = new Validation();

    User (String username) {
        this.username = username;
    }

    public int getId(String username) {
        return validation.idList.get(username);
    }

    public String getUsername() {
        return username;
    }

    public void changePassword(String username, String oldPassword, String newPassword) {
        validation.changePassword(username, oldPassword, newPassword);
    }
}
