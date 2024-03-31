package annotation_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Employee {
    @Autowired
//    @Qualifier("address")
    private Address address;
    private List<String> myfriends;

    public List<String> getMyfriends() {
        return myfriends;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", myfriends=" + myfriends +
                '}';
    }

    public void setMyfriends(List<String> myfriends) {
        this.myfriends = myfriends;
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
