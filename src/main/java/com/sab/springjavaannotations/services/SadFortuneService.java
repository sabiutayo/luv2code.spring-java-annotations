package com.sab.springjavaannotations.services;

import com.sab.springjavaannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day!";
    }
}
