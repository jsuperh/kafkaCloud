package com.joshuacc.kafkaCloud;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaCloudApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner (Producer producer) {
		return (args) -> {
			for (int i = 0; i < 20; i++) {
				producer.enviar(new EjemploMensaje(i, " Envia un simple mensaje  "));
			}
		};
	}
}
