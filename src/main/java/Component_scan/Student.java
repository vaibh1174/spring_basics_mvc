package Component_scan;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
    @Value("Raju")
    private String studentName;
    @Value("jharkhand")
    private String City;

    @Value("#{bestfriends}")
    private List<String> myfriends;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", City='" + City + '\'' +
                ", myfriends=" + myfriends +
                '}';
    }

    public List<String> getMyfriends() {
        return myfriends;
    }

    public void setMyfriends(List<String> myfriends) {
        this.myfriends = myfriends;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
