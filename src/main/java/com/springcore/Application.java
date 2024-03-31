package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = (Student) context.getBean("student1");
		Student s2= (Student) context.getBean("student2");
		Student s3= (Student) context.getBean("student3");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		Employee e1=(Employee) context.getBean("employee1");
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		B_ref b=(B_ref) context.getBean("bref");
		A_ref a=(A_ref) context.getBean("aref");
		System.out.println(b);
		System.out.println(a);
	}
}
