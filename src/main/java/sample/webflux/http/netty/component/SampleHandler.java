package sample.webflux.http.netty.component;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class SampleHandler 
{
	public Mono<ServerResponse> get(ServerRequest request)
	{
		return
			ServerResponse
				.ok()
				.body(Mono.fromCallable(() -> "SampleHandler GET"), String.class);
	}
}
