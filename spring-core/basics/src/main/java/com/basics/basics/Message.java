package com.basics.basics;

import org.springframework.beans.factory.annotation.Autowired;

public class Message {
    private String messageText;

    public Message() {

    }

    public Message(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                '}';
    }
}
