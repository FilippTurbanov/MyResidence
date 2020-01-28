package messenger;

import messenger.api.IChatSaver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ChatSaver implements IChatSaver {
    ArrayList<Message> messageHistory = new ArrayList<>();

    @Override
    public void save(ArrayList<Message> log) {
        messageHistory.addAll(log);
    }

    @Override
    public void saveToFile(ArrayList<Message> log) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("message_history.txt"));
            writer.println(log);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
