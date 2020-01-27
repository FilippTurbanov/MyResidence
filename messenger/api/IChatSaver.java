package messenger.api;

import messenger.Message;

import java.util.ArrayList;

public interface IChatSaver {
    void save(ArrayList<Message> log);
}
