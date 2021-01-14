package mx.com.vieracode.reactor;

import reactor.core.publisher.Mono;

public class Main {

	public static void main(String[] args) {
		Mono<String> mymono = Mono.just("Hello");
		mymono.subscribe(System.out::println);
	}

}
