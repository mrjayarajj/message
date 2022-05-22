package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@Slf4j
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    private String topic = "MESSAGE-TOPIC";

    @PostMapping(value = "/publish/kafka/message", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<KafkaMessage> publishKafkaMessage( @RequestBody KafkaMessage message) {
        log.info("message"+message);
        kafkaTemplate.send(topic, "MESSAGE_KEY", message);
        return ResponseEntity.ok(message);
    }
}
