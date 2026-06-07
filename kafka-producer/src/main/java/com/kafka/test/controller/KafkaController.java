package com.kafka.test.controller;

import com.kafka.test.model.Course;
import com.kafka.test.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/add-course")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        String response = kafkaService.sendMessage(course);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

}
