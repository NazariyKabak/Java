package Imitation.record.task2;

public class Employee {
    private Person person;
    private double salary;
    private String department;

    public Employee(Person person, double salary, String department) {
        this.person = person;
        this.salary = salary;
        this.department = department;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
