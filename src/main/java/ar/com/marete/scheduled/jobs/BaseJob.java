package ar.com.marete.scheduled.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseJob {
	
	private static Logger logger = LoggerFactory.getLogger(BaseJob.class);

	protected static Logger getLogger() {
		return logger;
	}

}	
