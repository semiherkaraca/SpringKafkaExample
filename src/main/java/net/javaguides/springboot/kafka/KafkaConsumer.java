package net.javaguides.springboot.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name:javaguides}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        log.info("Gonderilen Mesajlar: {}", message);
    }

}
