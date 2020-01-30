package messenger.api;

import messenger.User;
import messenger.data.MessageType;

import java.util.Date;

public interface IMessage<Message> {
    Message getMessage();
    Date getDate();
    User getUser();
    MessageType getMessageType();
}
