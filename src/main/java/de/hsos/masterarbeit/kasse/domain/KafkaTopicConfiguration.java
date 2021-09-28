package de.hsos.masterarbeit.kasse.domain;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class KafkaTopicConfiguration  {

    @Bean
    public NewTopic topicExample() {
        return TopicBuilder.name("articles")
                .build();
    }
}
