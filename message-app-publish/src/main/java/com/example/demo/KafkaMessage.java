package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class KafkaMessage  implements Serializable {

    private String uuid;
    private String host;
    private String traceId;
    private String spanId;
    private Long createTimestamp ;
    private Object payload;

}
