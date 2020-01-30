package messenger;

import messenger.api.IUser;
import messenger.data.TextMessage;

import java.io.Serializable;
import java.util.Objects;

public class User implements IUser, Serializable {
    private final String username;
    private final int id;
    private final String password;
    Validation validation = new Validation();
    Chat chat = new Chat();

    User(String username, int id, String password) {
        this.username = username;
        this.id = id;
        this.password = password;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(getPassword())) {
            validation.changePassword(username, newPassword);
        }
        else
            throw new IllegalArgumentException("Неверный пароль.");
    }

    @Override
    public void addMessage(TextMessage message) {
        chat.addMessage(message);
    }

    @Override
    public void authorization() throws IllegalAccessException {
        validation.authorization(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(validation, user.validation) &&
                Objects.equals(chat, user.chat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, id, password, validation, chat);
    }
}
