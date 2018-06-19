package com.demo.objects;


import javax.mail.Session;
import java.util.Properties;

public class EmailMessage {

    String recipient;
    String sender;
    String subject;
    String body;

    public EmailMessage(String recipient,String sender,String subject, String body){
        this.recipient = recipient;
        this.sender = sender;
        this.subject = subject;
        this.body = body;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
