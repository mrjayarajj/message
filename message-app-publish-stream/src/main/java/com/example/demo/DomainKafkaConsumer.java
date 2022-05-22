package com.example.demo;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class DomainKafkaConsumer {

  @Bean
  public Consumer<KStream<String, KafkaMessage>> domainService() {
    return kstream -> kstream.foreach((key, kafkaMessage) -> {
      System.out.println(String.format("kafkaMessage : "+ kafkaMessage));
    });
  }
}
