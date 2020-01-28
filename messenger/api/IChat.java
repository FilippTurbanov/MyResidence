package messenger.api;

public interface IChat {
    void addMessage(String message, String username);
    void addUser(String username);
    void saveChat();
    void saveToFile();
}
