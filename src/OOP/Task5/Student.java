package OOP.Task5;

public class Student {
    String firstName;
    String lastName;
    String group;
    double avgMark;

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public int getScholarship() {
        if (avgMark== 5) {
            return 2000;
        }
        return 1900;
    }

}
