package com.fullStackMailSend.mailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail(Entity entity) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(entity.getMail());
		simpleMailMessage.setSubject(entity.getTitle());
		simpleMailMessage.setText(entity.getText());
		javaMailSender.send(simpleMailMessage);
		System.out.println("Mesaj gitti...");
	}
}