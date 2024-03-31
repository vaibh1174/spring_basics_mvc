package annotation_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Employee emp1=context.getBean("myfriends", Employee.class);
        System.out.println(emp1);
    }
}
