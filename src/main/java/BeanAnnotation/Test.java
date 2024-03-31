package BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Beanconfig.class);
        Student s1=context.getBean("student1", Student.class);
        System.out.println(s1);

        Employee emp= context.getBean("getEmployee", Employee.class);
        System.out.println(emp);
    }
}
