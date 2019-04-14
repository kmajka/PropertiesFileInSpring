package com.myproject.mydemo.tech;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Technics {

    private String str;

    public Technics(@Value("${my.radio.name}") String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Technic{"+str+"}";
    }
}
