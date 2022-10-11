package com.example.diproject;

import com.example.diproject.controllers.*;
import com.example.diproject.datasource.FakeDataSource;
import com.example.diproject.services.PrototypeBean;
import com.example.diproject.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.example.diproject", "com.example.pets"})
@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiProjectApplication.class, args);

		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println(myController.sayHello());

		MyController myController1 = applicationContext.getBean(MyController.class);
		System.out.println(myController1.sayHello());

		System.out.println("-------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("------My controller");

		MyController myController2 = (MyController) applicationContext.getBean("myController");

		System.out.println(myController2.getGreeting());

		System.out.println("------Pet Controller");

		PetController petController = applicationContext.getBean(PetController.class);
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("------Singleton Bean");

		SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		System.out.println("------Prototype Bean");

		PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());


		System.out.println("------Fake Data Source(EXT. PROPERTIES)");

		FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

	}

}
