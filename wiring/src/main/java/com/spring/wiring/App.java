package com.spring.wiring;

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
       ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
       Employee employee = (Employee) context.getBean("emp");
       employee.display();
    }
}
