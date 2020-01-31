package messenger.api;

import java.io.IOException;
import java.util.ArrayList;

public interface IChatSaver {
    void save(ArrayList<IMessage> log);
    void saveToFile(ArrayList<IMessage> log);
    void saveToBinaryFile(ArrayList<IMessage> log) throws IOException;
}
