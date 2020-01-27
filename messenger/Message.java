package messenger;

import messenger.api.IMessage;
import messenger.data.MessageType;

import java.util.Date;

public class Message<Message> implements IMessage {
    public Message message;
    public Date date;
    public MessageType messageType;
    public String user;

    Message(Date date, MessageType messageType, String user, Message message) {
        this.date = date;
        this.messageType = messageType;
        this.user = user;
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getSender() {
        return user;
    }
}
