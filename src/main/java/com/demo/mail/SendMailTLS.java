package com.demo.mail;

import com.demo.objects.EmailMessage;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {
    Properties props;
    Session session;
    final String username;
    final String password;
    Message message;
    EmailMessage email_message;

    public SendMailTLS(Properties properties, String username, String password, EmailMessage email_message ) {
        this.username = username;
        this.password = password;
        this.props = properties;
        this.email_message = email_message;
        this.session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

        this.message = new MimeMessage(session);
    }

    public void sendMail() throws MessagingException {
        message.setFrom(new InternetAddress(email_message.getSender()));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(email_message.getRecipient()));
        message.setSubject(email_message.getSubject());
        message.setText(email_message.getBody());
        Transport.send(message);
        System.out.println("Done");
    }


}
