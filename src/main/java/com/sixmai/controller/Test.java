package com.sixmai.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestController testController = (TestController) applicationContext.getBean("testController");
        testController.example();
    }
}