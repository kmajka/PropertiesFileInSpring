package com.myproject.mydemo;

import com.myproject.mydemo.tech.Radio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MydemoApplication {

	public static void main(String[] args) {
		ApplicationContext apx = SpringApplication.run(MydemoApplication.class, args);
		Radio radio = apx.getBean(Radio.class);
		System.out.println(radio);
	}

}
