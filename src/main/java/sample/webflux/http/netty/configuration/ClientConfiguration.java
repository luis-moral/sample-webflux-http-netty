package sample.webflux.http.netty.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.webflux.http.netty.logic.ClientLogic;

@Configuration
public class ClientConfiguration 
{
	@Value("${server.port}")
	private int serverPort;
	
	@Value("${controller-sample.path}")
	private String controllerSamplePath;
	
	@Value("${router-sample.path}")
	private String routerSamplePath;
	
	@Bean
	public ClientLogic clientLogic()
	{
		return new ClientLogic(serverPort, controllerSamplePath, routerSamplePath);
	}
}
