package com.example.diproject;

import com.example.diproject.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiProjectApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println(myController.sayHello());

		MyController myController1 = applicationContext.getBean(MyController.class);
		System.out.println(myController1.sayHello());
	}

}
