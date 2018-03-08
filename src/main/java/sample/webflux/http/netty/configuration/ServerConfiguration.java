package sample.webflux.http.netty.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.webflux.http.netty.logic.ServerLogic;

@Configuration
public class ServerConfiguration 
{
	@Bean
	public ServerLogic serverLogic()
	{
		return new ServerLogic();
	}
}
