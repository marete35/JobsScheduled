package ar.com.marete.scheduled;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"ar.com.marete"})
public class JobsScheduledApplication implements CommandLineRunner{
	
	@Autowired
	DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(JobsScheduledApplication.class, args);
	}
	
	/**
	 * Codigo que se ejecuta despues que comenzo la aplicacion
	 */
	public void run(String... args) throws Exception{
		System.out.println("DATASOURCE Utilizado= " + dataSource);
		/**if(args.length > 0) {
			System.out.println(args[0].toString());
		}else {
			System.out.println("mario");
		}*/
		
		//Informacion sobre el pool de conexiones.
		HikariDataSource newds = (HikariDataSource)dataSource;
		System.out.println("\n");
        System.out.println("DATASOURCE MAX POOL = " + newds.getMaximumPoolSize());
        System.out.println("DATASOURCE CONNECT TIMEOUT = " + newds.getConnectionTimeout() + " milisegundos");
        System.out.println("DATASOURCE JDBC URL = " + newds.getJdbcUrl());
        System.out.println("DATASOURCE ISOLATION TRANSACTION = " + newds.getTransactionIsolation()); 
        System.out.println("DATASOURCE ISAUTOCOMMIT = " + newds.isAutoCommit());
        System.out.println("DATASOURCE POOL NAME = " + newds.getPoolName());
        System.out.println("DATASOURCE NAME SCHEMA = " + newds.getSchema());
		System.out.println("\n");
	}
}
