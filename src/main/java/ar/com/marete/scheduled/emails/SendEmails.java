package ar.com.marete.scheduled.emails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmails {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmail() {
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("mario.alberto.galarza@gmail.com");
		
		msg.setSubject("Te amooooooooooooooooooooooo");
		msg.setText("Te amooooooooooooooooooooooo");
		
		javaMailSender.send(msg);
		
	}

}
