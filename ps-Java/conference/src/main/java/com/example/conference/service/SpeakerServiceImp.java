package com.example.conference.service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImp(SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
