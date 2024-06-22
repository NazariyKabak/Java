package Imitation.record.task2;

public class Student {
    private Person person;
    private double avg;
    private String school;

    public Student(Person person, double avg, String school) {
        this.person = person;
        this.avg = avg;
        this.school = school;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", avg=" + avg +
                ", school='" + school + '\'' +
                '}';
    }
}
