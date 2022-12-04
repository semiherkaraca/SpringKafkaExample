package net.javaguides.springboot.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.springboot.payload.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class JsonKafkaProducer {

    @Value("${spring.kafka.topic.nameJson:javaguides_json}")
    private String topicJsonName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(User user) {
        log.info("Message Sent -> {}", user.toString());
        Message<User> message = MessageBuilder.withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, topicJsonName)
                .build();

        kafkaTemplate.send(message);
    }

}
