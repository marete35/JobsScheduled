package ar.com.marete.scheduled.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import ar.com.marete.scheduled.dao.TestJobDAO;
import ar.com.marete.scheduled.service.TestJobService;

@Configuration
@EnableScheduling
public class TestJob extends BaseJob{
	
	@Autowired
	private TestJobService testJobService;

	//se ejecuta cada 3 segundos
	@Scheduled(fixedRate = 3000)
	public void tarea1() {
		super.getLogger().info("TestJob.tarea1 - Tarea usando fixedRate cada {} segundos - Cantidad de BD: {}  - Tiempo - " + System.currentTimeMillis() / 1000,3,testJobService.getCount());
	}
	
	@Scheduled(fixedRateString = "${imprime.tarea}")
	public void tarea2() {
		//Usando fixedRateStringpodemos tener el tiempo de ejecución en el archivo de configuración de spring boot.(application.properties)
		super.getLogger().info("TestJob.tarea2 - Tarea usando fixedRateString cada {} segundos - " + System.currentTimeMillis() / 1000,5);

	}
}
