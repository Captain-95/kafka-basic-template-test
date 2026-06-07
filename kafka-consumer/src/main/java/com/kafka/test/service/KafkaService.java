package com.kafka.test.service;

import com.kafka.test.model.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private String message;
    @KafkaListener(topics = "test" , groupId = "test-consumer-group")

    public void consume(Course course){
        message = course + " get the message from kafka";
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }



}
