package sample.webflux.http.netty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "${controller-sample.path}")
public class SampleController 
{
	@GetMapping
	public Mono<String> get()
	{
		return Mono.just("SampleController GET");
	}
}
