package com.harsrav.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext factory = new ClassPathXmlApplicationContext("Spring.xml");
       Employe obj = (Employe)factory.getBean("employe");
       obj.code();
       
    }
}
