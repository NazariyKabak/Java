package Collection.ArrayList;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private double rating;

    public Student(String name, int age, double rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(rating, student.rating) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rating);
    }


    public int compareTo(Student other){
        int cmp = this.name.compareTo(other.name);
        if(cmp == 0){
            cmp=this.age-other.age;
        }
        if(cmp == 0){
            return Double.compare(this.rating, other.rating);
        }
        return cmp;
    }
}
