package com.example.conference.repository;

import com.example.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Mert");
        speaker.setLastName("mert");
        speaker.setConferenceSubject("Java");

        speakers.add(speaker);

        return speakers;

    }
}
