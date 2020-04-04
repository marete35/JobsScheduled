package ar.com.marete.scheduled.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.marete.scheduled.dao.TestJobDAO;

@Service
public class TestJobService {
	
	@Autowired
	private TestJobDAO testJobDAO;

	public Integer getCount() {
		return testJobDAO.getCount();
	}
	

}
