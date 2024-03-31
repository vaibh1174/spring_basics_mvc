package BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "BeanAnnotation")
public class Beanconfig {

    @Bean
    public Schedule getschedule(){
        return new Schedule();
    }

    @Bean
    public Employee getEmployee(){
        getschedule().display();
        Employee employee=new Employee();
        return employee;
    }
}
