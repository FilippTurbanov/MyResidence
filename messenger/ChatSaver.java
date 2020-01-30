package messenger;

import messenger.api.IChatSaver;
import messenger.api.IMessage;

import java.io.*;
import java.util.ArrayList;

public class ChatSaver implements IChatSaver {
    ArrayList<IMessage> messageHistory = new ArrayList<>();

    @Override
    public void save(ArrayList<IMessage> log) {
        messageHistory.addAll(log);
    }

    @Override
    public void saveToFile(ArrayList<IMessage> log) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("message_history.txt"));
            writer.println((log.toString()));
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveToBinaryFile(ArrayList<IMessage> log) throws IOException {
        FileOutputStream stream = new FileOutputStream("message_history.tmp");
        ObjectOutputStream save = new ObjectOutputStream(stream);
        save.writeObject(log);
        save.close();
    }
}
