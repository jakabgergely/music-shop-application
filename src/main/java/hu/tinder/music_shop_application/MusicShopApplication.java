package hu.tinder.music_shop_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * nagyon sok mindent csinál: autowiring, autoconfig, dependency injection, mi aza  frame work, mi az a lib, jar, embedded tomcat...
 */
@SpringBootApplication
public class MusicShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicShopApplication.class, args);
	}

}
