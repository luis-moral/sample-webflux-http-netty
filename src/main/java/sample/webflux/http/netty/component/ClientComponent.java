package sample.webflux.http.netty.component;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;
import sample.webflux.http.netty.logic.ClientLogic;

@Component
public class ClientComponent implements ApplicationListener<ApplicationReadyEvent>
{
	@Autowired
	private ConfigurableApplicationContext applicationContext;
	
	@Autowired
	private ClientLogic clientLogic;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) 
	{	
		clientLogic.doLogic();
		
		Mono
			.delay(Duration.ofSeconds(5))
			.map(value -> SpringApplication.exit(applicationContext, () -> 0))
			.subscribe(exitValue -> System.exit(exitValue));
	}
}
