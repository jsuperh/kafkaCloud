package com.joshuacc.kafkaCloud;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Consumer {

    @KafkaListener(topics = "${cloudkarafka.topic}")
    public void processMessage(String mensaje,
                              @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> particiones,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topico,
                               @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        System.out.printf("%s-%d[%d] \"%s\" \n", topico.get(0),
                particiones.get(0),
                offsets.get(0),
                mensaje);
    }

}
