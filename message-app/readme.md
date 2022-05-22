
## Installation
Install Kafka [docker-compose.yml](https://docs.confluent.io/platform/current/quickstart/ce-docker-quickstart.html?utm_medium=sem&utm_source=google&utm_campaign=ch.sem_br.brand_tp.prs_tgt.confluent-brand_mt.mbm_rgn.namer_lng.eng_dv.all_con.confluent-docker&utm_term=%2Bconfluent%20%2Bdocker&creative=&device=c&placement=&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45ZUu5U4QMwz6EDb7mN6vbHGNGCs6SSySH4ZDnsZ5Q9vcYJ7BKKN98QaApIhEALw_wcB)

Note : [Docker Memory settings to be 8 GB](https://github.com/confluentinc/demo-scene/issues/111)
```
docker-compose.yml up
```

## Producer
```
curl -XPOST -H "Content-type: application/json" -d '{ "payload" : "some message" }' 'http://localhost:8080/publish/kafka/message'
```
kafka-streams ,
spring-kafka

## Consumer
```
log.info("KafkaMessage :"+message);
```
kafka-streams ,
spring-kafka

## Consumer stream
```
log.info("KafkaMessage :"+message);
```
kafka-streams ,
spring-cloud-stream ,
spring-cloud-stream-binder-kafka-streams

