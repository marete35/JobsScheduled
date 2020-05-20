package ar.com.marete.scheduled;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
@EnableScheduling
public class JobsScheduledApplication implements CommandLineRunner{
	
	@Autowired
	DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(JobsScheduledApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		System.out.println("DATASOURCE = " + dataSource);
		HikariDataSource newds = (HikariDataSource)dataSource;
        System.out.println("DATASOURCE MAX POOL = " + newds.getMaximumPoolSize());
	}
	
}
