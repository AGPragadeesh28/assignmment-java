package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new  ClassPathXmlApplicationContext("/com/demo1/spring-config.xml");
		Employee employee = (Employee) context.getBean("employee");
	    employee.setEmpno(135);
		employee.setEmpName("welcome pragadeesh");
		System.out.println(employee.getEmpno());
		System.out.println(employee.getEmpName());
	    System.out.println("First Demo of Spring");
		

	}

}
