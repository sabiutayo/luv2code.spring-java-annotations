package com.sab.springjavaannotations.services;

import com.sab.springjavaannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a happy day!";
    }
}
