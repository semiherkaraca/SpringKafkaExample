package net.javaguides.springboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "spring.kafka")
public class ApplicationProperties {

    private final Topic topic = new Topic();

    @Getter
    @Setter
    public static class Topic {
        private String name;
        private String nameJson;
    }
}
