package com.example.mybatis2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mybatis2Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mapper.xml");
        UserMapper userMapper= (UserMapper) applicationContext.getBean("UserMapper");
        System.out.println(userMapper.findAllUsers().size());
    }

}
