package messenger.data;

import messenger.User;
import messenger.api.IMessage;

import java.util.Date;

public class TextMessage implements IMessage<String> {
    private String message;
    private Date date;
    private User user;

    TextMessage(Date date, User user, String message) {
        this.date = date;
        this.user = user;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public MessageType getMessageType() {
        return MessageType.SYMBOL;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "message='" + message + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
