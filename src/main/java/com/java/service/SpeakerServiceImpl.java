package com.java.service;

import com.java.model.Speaker;
import com.java.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("speakerService")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    private SpeakerRepository speakerRepository;

    @Override
    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
