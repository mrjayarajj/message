package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaMessage implements Serializable {

    private String uuid;
    private String host;
    private String traceId;
    private String spanId;
    private Long createTimestamp;
    private Object payload;

}
