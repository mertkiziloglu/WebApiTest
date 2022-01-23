package com.example.conference;

import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceApplication.class, args);

    }

}
