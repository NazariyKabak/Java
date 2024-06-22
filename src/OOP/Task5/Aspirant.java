package OOP.Task5;

public class Aspirant extends Student{
    String scientificWork;





    public Aspirant(String firstName, String lastName, String group, double avgMark, String scientificWork) {
        super(firstName, lastName, group, avgMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        return avgMark==5?2500:2200;
    }
}
