package messenger;

import messenger.api.IRegistration;

public class Registration implements IRegistration {
    Validation validation = new Validation();

    @Override
    public User setNewUser(String username, String password) {
        if (validation.userRegistrationCheck(username)) {
            if (validation.passwordRegistrationCheck(password)) {
                int id = setAndGetId(username);
                System.out.println("Поздравляем, " + username + "! Вы успешно зарегистрировались.");
                validation.addNewUser(username, password);
                return new User(username, id, password);
            }
        }
        else {
            throw new IllegalArgumentException("Пользователь с таким именем существует!");
        }
        return null;
    }

    @Override
    public int setAndGetId(String username) {
        int id = 1;
        while (true) {
            if (validation.idCheck(id)) {
                validation.setId(username, id);
                break;
            }
            else
                id++;
        }
        return id;
    }
}
