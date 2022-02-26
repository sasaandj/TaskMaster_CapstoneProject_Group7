package com.group7.taskmaster.services;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.group7.taskmaster.beans.RegisterUser;

public class EmailServices {

	private RegisterUser user = new RegisterUser();
	private String userEmail;

	public EmailServices(String userEmail) {
		super();
		this.userEmail = userEmail;
	}

	public void sendEmail() {

		// declaring the sender's email address and password
		String email = "taskmaster.group7@gmail.com";
		String password = "Group07!!";

		// create a properties instance
		Properties p = new Properties();

		// setting the properties to the gmail host
		p.setProperty("mail.smtp.auth", "true");
		p.setProperty("mail.smtp.starttls.enable", "true");
		p.setProperty("mail.smtp.host", "smtp.gmail.com");
		p.setProperty("mail.smtp.port", "587");

		// passing the property object and creating a session for authenticating the
		// email
		Session session = Session.getDefaultInstance(p, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(email, password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(email));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
			message.setText("Welcome to TaskMaster! Please verify your email address.");
			message.setText("Click here: " + "http://localhost:8081/TaskMaster_CapstoneProject_Group7/ActivateUser?email=" + userEmail);
			Transport.send(message);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.print(e);

		}

	}

}