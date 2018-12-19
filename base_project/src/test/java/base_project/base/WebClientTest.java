package base_project.base;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientTest {
	
	@Test
	public void testFind() {
		Mono<String> bodyMono = WebClient
		.create()
		.get()
		.uri("http://localhost:8080/api/v1/user/find?id={id}", 2)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve().bodyToMono(String.class);
		
		System.out.println(bodyMono.block());
	}
	
	@Test
	public void testDelete() {
		Mono<String> bodyMono = WebClient
		.create()
		.delete()
		.uri("http://localhost:8080/api/v1/user/delete?id={id}", 2)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve().bodyToMono(String.class);
		
		System.out.println(bodyMono.block());
	}
}
