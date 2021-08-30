package com.fullStackMailSend.mailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
@CrossOrigin
public class RestApi {
	@Autowired
	private SendEmailService sendEmailService;

	public void triggerWhenStarts(Entity entity) {
		sendEmailService.sendMail(entity);
	}

	@PostMapping("/")
	public void add(@RequestBody Entity entity) {
		triggerWhenStarts(entity);
	}
}
