package messenger.api;

public interface IChat {
    void addMessage(IMessage message);
    void addUser(String username);
    void saveChat();
}
