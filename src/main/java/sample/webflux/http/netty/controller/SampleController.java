package sample.webflux.http.netty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import sample.webflux.http.netty.logic.ServerLogic;

@RestController
@RequestMapping(path = "${controller-sample.path}")
public class SampleController 
{
	private final ServerLogic serverLogic;
	
	@Autowired
	public SampleController(ServerLogic serverLogic)
	{
		this.serverLogic = serverLogic;
	}
	
	@GetMapping
	public Mono<String> get()
	{
		return Mono.fromCallable(() -> serverLogic.doLogic());
	}
}
