package sample.webflux.http.netty.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import sample.webflux.http.netty.logic.ServerLogic;

@Component
public class SampleHandler 
{
	@Autowired
	private ServerLogic serverLogic;
	
	public Mono<ServerResponse> get(ServerRequest request)
	{
		return
			ServerResponse
				.ok()
				.body(Mono.fromCallable(() -> serverLogic.doLogic()), String.class);
	}
}
