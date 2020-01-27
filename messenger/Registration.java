package messenger;

import messenger.api.IRegistration;

public class Registration implements IRegistration {
    Validation validation = new Validation();

    @Override
    public void setNewUser(String username, String password) {
        if (validation.userRegistrationCheck(username)) {
            if (validation.passwordRegistrationCheck(password)) {
                setId(username);
                System.out.println("Поздравляем, " + username + "! Вы успешно зарегистрировались.");
                validation.addNewUser(username, password);
            }
        }
        else
            System.out.println("Пользователь с таким именем существует!");
    }

    @Override
    public void setId(String username) {
        int id = 1;
        while (true) {
            if (validation.idCheck(id)) {
                validation.idList.put(username, id);
                break;
            }
            else
                id++;
        }
    }
}
