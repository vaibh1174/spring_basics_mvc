package BeanAnnotation;

import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
    private String name;
    private String rollnumber;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnumber='" + rollnumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }
}
