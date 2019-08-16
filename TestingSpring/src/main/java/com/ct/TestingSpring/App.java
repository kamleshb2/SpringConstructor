package com.ct.TestingSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("SpringConfig.xml");
       
       Employee e = (Employee) con.getBean("employee");
       System.out.println(e);
    }
}
