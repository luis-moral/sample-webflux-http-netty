package sample.webflux.http.netty.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import sample.webflux.http.netty.component.SampleHandler;

@Configuration
public class RouterFunctionConfiguration 
{
	@Value("${router-sample.path}")
	private String routerSamplePath;
	
	@Bean
	public RouterFunction<ServerResponse> sampleRouterFunction(SampleHandler webFluxSampleHandler)
	{
		return 
			RouterFunctions
				.route(RequestPredicates.GET(routerSamplePath), webFluxSampleHandler::get);
	}
}
