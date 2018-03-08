package sample.webflux.http.netty.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.scheduler.Schedulers;

public class ClientLogic 
{
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private final String controllerSamplePath;
	private final String routerSamplePath;
	private final WebClient webClient;
	
	public ClientLogic(int serverPort, String controllerSamplePath, String routerSamplePath) 
	{
		this.controllerSamplePath = controllerSamplePath;
		this.routerSamplePath = routerSamplePath;
		
		webClient = WebClient.create("http://localhost:" + serverPort);
	}
	
	public void doLogic()
	{
		webClient
			.get()
			.uri(controllerSamplePath)
			.retrieve()
			.bodyToMono(String.class)
			.subscribeOn(Schedulers.elastic())
			.subscribe(response -> logger.info("Controller response=[{}]", response));
		
		webClient
			.get()
			.uri(routerSamplePath)
			.retrieve()
			.bodyToMono(String.class)
			.subscribeOn(Schedulers.elastic())
			.subscribe(response -> logger.info("Router response=[{}]", response));		
	}
}
