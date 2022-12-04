package net.javaguides.springboot.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

    @Value("${spring.kafka.topic.name:javaguides}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info(String.format("Message sent %s", message));
        kafkaTemplate.send(topicName, message);
    }
}
