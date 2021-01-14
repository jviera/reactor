package mx.com.vieracode.reactor;

import reactor.core.publisher.Flux;

public class Main02 {

	public static void main(String[] args) {
		Flux<String> elements = Flux.just("How","are","you","doing","?");
		elements.subscribe(System.out::println);
	}

}
