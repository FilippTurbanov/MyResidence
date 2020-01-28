package messenger;

import messenger.api.IChat;
import messenger.data.MessageType;

import java.util.ArrayList;
import java.util.Date;

public class Chat implements IChat {
    public ArrayList<User> chatList = new ArrayList<>();
    public ArrayList<Message> messageList = new ArrayList<>();
    ChatSaver saver = new ChatSaver();

    @Override
    public void addMessage(String message, String username) {
        Message<String> information = new Message<>(new Date(), MessageType.SYMBOL, username, message);
        messageList.add(information);
    }

    public void addMessage(String[] message, String username) {
        Message<String[]> information = new Message<>(new Date(), MessageType.SYMBOL, username, message);
        messageList.add(information);
    }

    public void addMessage(ArrayList<Message> message, String username) {
        Message<ArrayList<Message>> information = new Message<>(new Date(), MessageType.SYMBOL, username, message);
        messageList.add(information);
    }

    @Override
    public void addUser(String username) {
        User user = new User(username);
        if (!chatList.contains(user)) {
            chatList.add(user);
        }
    }

    @Override
    public void saveChat() {
        saver.save(messageList);
    }

    @Override
    public void saveToFile() {
        saver.saveToFile(messageList);
    }
}
