# Spring Boot 2.0 WebFlux Reactive HTTP client and server

Sample project using **spring-boot-webflux** with **reactor-netty** reactive http client and server. The target of the sample is provide a sample on how to use webflux **@Controller**, **RouterFunction** and **WebClient**.

### Controller

Sample spring controller that will execute ServerLogic on GET HTTP request.

[SampleController](src/main/java/sample/webflux/http/netty/controller/SampleController.java)

[ServerLogic](src/main/java/sample/webflux/http/netty/logic/ServerLogic.java)

### Router Function

Sample handler function that will execute ServerLogic on request and sample router function that will route a GET HTTP request to the sample handler.

[SampleHandler](src/main/java/sample/webflux/http/netty/component/SampleHandler.java)

[RouterFunctionConfiguration](src/main/java/sample/webflux/http/netty/configuration/RouterFunctionConfiguration.java)

[ServerLogic](src/main/java/sample/webflux/http/netty/logic/ServerLogic.java)

## Client

Sample client that will do a GET HTTP request to the controller and to the router function samples, log the response, wait 5 seconds and terminate the application.

[ClientConfiguration](src/main/java/sample/webflux/http/netty/configuration/ClientConfiguration.java)

[ClientLogic](src/main/java/sample/webflux/http/netty/logic/ClientLogic.java)

## Documentation

[WebFlux](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux)

[Functional Endpoints](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-fn)

[WebClient](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-client)

[Servers](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-httphandler)