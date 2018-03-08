package sample.webflux.http.netty.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import sample.webflux.http.netty.logic.ClientLogic;

@Component
public class ClientComponent implements ApplicationListener<ApplicationReadyEvent>
{
	@Autowired
	private ClientLogic clientLogic;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) 
	{	
		clientLogic.doLogic();
	}
}
