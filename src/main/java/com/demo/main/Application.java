package com.demo.main;

import com.demo.mail.SendMailTLS;
import com.demo.objects.EmailMessage;

import javax.mail.MessagingException;
import java.util.Properties;

import static java.lang.System.out;

public class Application {

    public static void main(String[] args){
        out.println("Hello world");

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        // props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "HOST");
        props.put("mail.smtp.port", "POST");
        props.put("mail.smtp.socketFactory.port", "25");

        EmailMessage my_message = new EmailMessage("recep@mail.com", "sender@mail.com",
                "Esto es una prueba", "Hola! " +
                "\nEsta es una prueba de una clase de envio de correo." +
                "\nSaludos.");

        SendMailTLS sendMail = new SendMailTLS(props, "USERNAME", "PASSWORD", my_message);

        try {
            sendMail.sendMail();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
