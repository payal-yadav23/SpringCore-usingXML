package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Employee;
import com.entities.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s = context.getBean("stud", Student.class);
		System.out.println(s);

		Employee e = context.getBean(Employee.class);
		System.out.println(e);

	}

}
