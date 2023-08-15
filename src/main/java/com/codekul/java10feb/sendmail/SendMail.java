package com.codekul.java10feb.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("sentMail")
//public class SendMail {
//
//    @Autowired
//    private MailSender mailSender;
//
//    @GetMapping("sendMail")
//    public String sendMail(){
//        String from="rutujamsathe81@gmail.com";
//        String to="";
//
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setText("Hii...");
//        mailSender.send(mailMessage);
//
//        return "Mail Sent Successfully...";
//    }
//}
