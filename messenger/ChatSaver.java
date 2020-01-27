package messenger;

import messenger.api.IChatSaver;

import java.util.ArrayList;

public class ChatSaver implements IChatSaver {
    ArrayList<Message> messageHistory = new ArrayList<>();

    @Override
    public void save(ArrayList<Message> log) {
        messageHistory.addAll(log);
    }
}
