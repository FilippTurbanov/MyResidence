package messenger;

import messenger.api.IValidation;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation implements IValidation {
    public final HashMap <String, Integer > idList = new HashMap<>();
    private final HashMap <String, String> userList = new HashMap<>();

    @Override
    public boolean userRegistrationCheck(String username) {
        return (!userList.containsValue(username));
    }

    @Override
    public boolean userValidationCheck(String username) {
        return (userList.containsValue(username));
    }

    @Override
    public boolean idCheck(Integer id) {
        return (!idList.containsValue(id));
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
                            System.out.println("Пароль не может содержать одинаковых рядом стоящих символов");
                            return false;
                        }
                    }
                    return true;
                }
                else {
                    System.out.println("Пароль должен содержать минимум один из символов: ' : / ! ? + % ");
                    return false;
                }
            }
            else {
                System.out.println("Пароль может содержать латинские буквы любого регистра, цифры" +
                        "и символы: ' : / ! ? + % ");
                return false;
            }
        }
        else {
            System.out.println("Длина пароля должна быть не менее 7 символов");
            return false;
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

    public void changePassword(String username, String oldPassword, String newPassword) {
        System.out.println("Введите прежний пароль:");
        if (passwordValidationCheck(username, oldPassword)) {
            System.out.println("Введите новый пароль:");
            if (passwordRegistrationCheck(newPassword)) {
                userList.put(username, newPassword);
            }
        }
        else
            System.out.println("Неверный пароль.");
    }

    @Override
    public void authorization(String username, String password) {
        Chat chat = new Chat();
        System.out.println("Введите логин и пароль:");
        if (userValidationCheck(username)) {
            if (passwordValidationCheck(username, password)) {
                chat.addUser(username);
                System.out.println("Добро пожаловать, " + username + "!");
            }
            else
                System.out.println("Неверный пароль!");
        }
        else
            System.out.println("Пользователя с таким именем не существует!");
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
