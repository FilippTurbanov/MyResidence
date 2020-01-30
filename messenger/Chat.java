package messenger;

import messenger.api.IChat;
import messenger.api.IMessage;
import messenger.data.TextMessage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Chat implements IChat, Serializable {
    private final ArrayList<User> chatList = new ArrayList<>();
    private final ArrayList<IMessage> messageList = new ArrayList<>();
    ChatSaver saver = new ChatSaver();

    @Override
    public void addMessage(TextMessage message) {
        messageList.add(message);
    }

    public void addMessage(TextMessage[] message) {
        if(message != null){
            for (TextMessage textMessage : message) {
                this.addMessage(textMessage);
            }
        }
    }

    public void addMessage(ArrayList<TextMessage> message) {
        if(message != null){
            for (TextMessage textMessage : message) {
                this.addMessage(textMessage);
            }
        }
    }

    @Override
    public void addUser(User user) throws IllegalAccessException {
        if (!chatList.contains(user)) {
            chatList.add(user);
        }
        else
            throw new IllegalAccessException("Вы уже залогинены.");
    }

    @Override
    public void saveChat() {
        saver.save(messageList);
    }

    @Override
    public void saveToFile() {
        saver.saveToFile(messageList);
    }

    @Override
    public void saveToBinaryFile() throws IOException {
        saver.saveToBinaryFile(messageList);
    }
}
