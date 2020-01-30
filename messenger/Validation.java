package messenger;

import messenger.api.IValidation;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation implements IValidation {
    private final HashMap <String, Integer > idList = new HashMap<>();
    private final HashMap <String, String> userList = new HashMap<>();
    private byte counter = 0;

    @Override
    public boolean userRegistrationCheck(String username) {
        return (!userList.containsValue(username));
    }

    @Override
    public boolean userValidationCheck(String username) {
        return (userList.containsValue(username));
    }

    @Override
    public boolean idCheck(int id) {
        return (!idList.containsValue(id));
    }

    public void setId(String username, int id) {
        idList.put(username, id);
    }

    @Override
    public boolean passwordRegistrationCheck(String password) {
        String generalRequirements = "[A-Za-z0-9':/!?+%]+";
        String specialRequirements = "[':/!?+%]+";
        Pattern pattern = Pattern.compile(generalRequirements);
        Pattern pattern2 = Pattern.compile(specialRequirements);
        Matcher matcher = pattern.matcher(password);
        Matcher matcher2 = pattern2.matcher(password);
        if (password.length() >= 7) {
            if (matcher.find()) {
                if (matcher2.find()) {
                    char[] chars = password.toCharArray();
                    for (int i = 0; i < chars.length - 2; i++) {
                        char c = chars[i];
                        if (c == chars[i+1]) {
                            throw new IllegalArgumentException("Пароль не может содержать одинаковых рядом стоящих символов");
                        }
                    }
                    return true;
                }
                else {
                    throw new IllegalArgumentException("Пароль должен содержать минимум один из символов: ' : / ! ? + % ");
                }
            }
            else {
                throw new IllegalArgumentException("Пароль может содержать латинские буквы любого регистра, цифры" +
                        "и символы: ' : / ! ? + % ");
            }
        }
        else {
            throw new IllegalArgumentException("Длина пароля должна быть не менее 7 символов");
        }
    }

    @Override
    public boolean passwordValidationCheck(String username, String password) {
        return (userList.get(username).equals(password));
    }

    @Override
    public void addNewUser(String username, String password) {
        userList.put(username, password);
    }

    public void changePassword(String username, String newPassword) {
        if (passwordRegistrationCheck(newPassword)) {
            userList.put(username, newPassword);
        }
        else if (counter < 2) {
            counter++;
            System.out.println("Неверный пароль. Осталось попыток: " + (3-counter) + ".");
            changePassword(username, newPassword);
        }
        else
            throw new IllegalArgumentException("Неверный пароль.");
    }

    @Override
    public void authorization(User user) throws IllegalAccessException {
        Chat chat = new Chat();
        if (userValidationCheck(user.getUsername())) {
            if (passwordValidationCheck(user.getUsername(), user.getPassword())) {
                chat.addUser(user);
                System.out.println("Добро пожаловать, " + user.getUsername() + "!");
            }
            else
                throw new IllegalArgumentException("Неверный пароль!");
        }
        else
            throw new IllegalArgumentException("Пользователя с таким именем не существует!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Validation that = (Validation) o;
        return Objects.equals(idList, that.idList) &&
                Objects.equals(userList, that.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idList, userList);
    }
}
