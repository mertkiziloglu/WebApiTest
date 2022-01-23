package com.example.conference.service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {


    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
