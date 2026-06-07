package com.kafka.test.controller;

import com.kafka.test.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

        @GetMapping("/get-course")
    public ResponseEntity<String> getCourse(){
        String response = kafkaService.getMessage();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

}
