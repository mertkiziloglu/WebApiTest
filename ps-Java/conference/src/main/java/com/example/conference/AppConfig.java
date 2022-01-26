package com.example.conference;
import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;
import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImp;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        //return new SpeakerServiceImp();
        SpeakerServiceImp service = new SpeakerServiceImp(getSpeakerRepository());
        service.setRepository(getSpeakerRepository());
        return service;
        //this set injection example...
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }




}
