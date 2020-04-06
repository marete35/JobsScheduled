package ar.com.marete.scheduled.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import ar.com.marete.scheduled.jobs.BaseJob;

public class BaseJobDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	protected static Logger logger = LoggerFactory.getLogger(BaseJob.class);
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

}
