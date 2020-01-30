package messenger.api;

import messenger.User;
import messenger.data.TextMessage;

import java.io.IOException;

public interface IChat {
    void addMessage(TextMessage message);
    void addUser(User user) throws IllegalAccessException;
    void saveChat();
    void saveToFile();
    void saveToBinaryFile() throws IOException;
}
