package BeanAnnotation;

public class Employee {
    private String name;
    private String salary;
    private Schedule schedule;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", schedule=" + schedule +
                '}';
    }

    public Schedule getSchedule() {
        schedule.display();
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
