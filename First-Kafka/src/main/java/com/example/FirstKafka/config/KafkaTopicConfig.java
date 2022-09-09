package com.example.FirstKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic addTopic(){
        return TopicBuilder.name("FirstTopic")
                .build();
    }

    @Bean
    public NewTopic addJsonTopic(){
        return TopicBuilder.name("FirstJsonTopic")
                .build();
    }
}
