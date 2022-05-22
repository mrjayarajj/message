package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@Slf4j
@SpringBootApplication
public class MessageAppPublishApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageAppPublishApplication.class, args);
	}

	@KafkaListener(topics = "MESSAGE-TOPIC", groupId = "consumer-groupid")
	public void consume(@Payload KafkaMessage message, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String messageKey) {
		log.info("KafkaMessage :"+message);
		log.info("messageKey :"+messageKey);
	}

}
