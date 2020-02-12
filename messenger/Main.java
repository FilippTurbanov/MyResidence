package messenger;

import java.io.*;
import java.util.HashMap;

public class Main {
    Validation validation = new Validation();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Main().userListLoad();
        // тут много разного кода
        new Main().userListSave();
    }

    public void userListLoad() throws IOException, ClassNotFoundException {
        FileInputStream start = new FileInputStream("user_list.tmp");
        ObjectInputStream load = new ObjectInputStream(start);
        HashMap<String, String> userList = (HashMap<String, String>) load.readObject();
        load.close();
        validation.setUserList(userList);
    }

    public void userListSave() throws IOException {
        FileOutputStream finish = new FileOutputStream("user_list.tmp");
        ObjectOutputStream save = new ObjectOutputStream(finish);
        save.writeObject(validation.getUserList());
        save.close();
    }
}
