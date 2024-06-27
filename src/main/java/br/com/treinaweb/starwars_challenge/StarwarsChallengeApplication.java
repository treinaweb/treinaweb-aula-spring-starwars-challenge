package br.com.treinaweb.starwars_challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StarwarsChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarwarsChallengeApplication.class, args);
	}

}
