package com.example.diproject.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBean() {
        System.out.println("Lifecycle Demobean is initialized");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My name is " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The LifecycleDemobean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("All properties of bean has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("The post construct method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("The pre destroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("before init method has been called");
    }

    public void afterInit() {
        System.out.println("after init method has been called");
    }
}
