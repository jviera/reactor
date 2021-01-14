package mx.com.vieracode.reactor;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main03 {

	public static void main(String[] args) {
		Mono<String> mymono = Mono.just("Hello").delayElement(Duration.ofSeconds(5));
		//mymono.subscribe(System.out::println);
		
		Mono<String> mymono2 = Mono.just("Hello2").delayElement(Duration.ofSeconds(3));
		//mymono2.subscribe(System.out::println);
		
		Flux<String> myflux = Flux.merge(mymono, mymono2);
		myflux.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
			System.out.println("End!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
