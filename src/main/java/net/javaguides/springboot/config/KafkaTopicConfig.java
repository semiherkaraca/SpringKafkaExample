package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name:javaguides}")
    private String topicName;

    @Value("${spring.kafka.topic.nameJson:javaguides_json}")
    private String nameJson;

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name(topicName).build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic() {
        return TopicBuilder.name(nameJson).build();
    }

}
