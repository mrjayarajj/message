package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class DomainKafkaConsumer {

  @Bean
  public Consumer<KStream<String, KafkaMessage>> domainService() {
    return kstream -> kstream.foreach((key, kafkaMessage) -> {
      log.info("kafkaMessage : "+ kafkaMessage);
    });
  }
}
