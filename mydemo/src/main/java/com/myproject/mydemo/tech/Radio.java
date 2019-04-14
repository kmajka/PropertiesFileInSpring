package com.myproject.mydemo.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {

    @Autowired
    Technics technics;

    @Override
    public String toString() {
        return "Radio{" +
                "technics=" + technics +
                '}';
    }
}
