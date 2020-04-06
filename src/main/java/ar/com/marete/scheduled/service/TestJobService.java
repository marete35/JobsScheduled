package ar.com.marete.scheduled.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.marete.scheduled.dao.TestJobDAO;
import ar.com.marete.scheduled.emails.SendEmails;

@Service
public class TestJobService {
	
	@Autowired
	private TestJobDAO testJobDAO;
	
	@Autowired
	private SendEmails sendEmails;

	public Integer getCount() {
		sendEmails.sendEmail();
		return testJobDAO.getCount();
	}
	

}
