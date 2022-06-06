package com.joshuacc.kafkaCloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private final KafkaTemplate<String, String> kafkaEsquema;

    @Value("${cloudkarafka.topic}")
    private String topico;

    Producer(KafkaTemplate<String, String> kafkaEsquema){
        this.kafkaEsquema = kafkaEsquema;
    }

    public void enviar(EjemploMensaje ejemploMensaje){
        this.kafkaEsquema.send(topico,ejemploMensaje.getMensaje());
            System.out.println("Enviando el mensaje [ " + ejemploMensaje + " ] al topico: "+ topico);

    }
}
