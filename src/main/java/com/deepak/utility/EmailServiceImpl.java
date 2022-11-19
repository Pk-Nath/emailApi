package com.deepak.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void sendEmail(String to, String sub, String body) {
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(sub);
		mail.setText(body);
		mailSender.send(mail);
		for(int i=0;i<100;i++) {
			System.err.println("mail sent");
			//mailSender.send(mail);
		}
	}
	
}
