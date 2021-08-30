package com.fullStackMailSend.mailSend;

public class Entity {
	private String mail;
	private String title;
	private String text;

	public Entity() {

	}

	public Entity(String mail, String title, String text) {
		this.mail = mail;
		this.title = title;
		this.text = text;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
