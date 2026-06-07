package com.kafka.test.service;

import com.kafka.test.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, Course> kafkaTemplate;

    public String sendMessage(Course course){

        kafkaTemplate.send("test","course",course);

        return "Course message to kafka server";
    }



}
