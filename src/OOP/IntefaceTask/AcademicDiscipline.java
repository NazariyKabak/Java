package OOP.IntefaceTask;

public class AcademicDiscipline {
    public enum Discipline{
        GENERAL_EDUCATION, SPECIALIZATION
    }
    private String name;
    private int lectureHours;
    private int practicalHours;
    private int labHours;
    private int numberOfTopics;
    private Discipline type;

    public AcademicDiscipline(String name, int lectureHours, int practicalHours, int labHours, int numberOfTopics, Discipline type) {
        this.name = name;
        this.lectureHours = lectureHours;
        this.practicalHours = practicalHours;
        this.labHours = labHours;
        this.numberOfTopics = numberOfTopics;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLectureHours() {
        return lectureHours;
    }

    public void setLectureHours(int lectureHours) {
        this.lectureHours = lectureHours;
    }

    public int getPracticalHours() {
        return practicalHours;
    }

    public void setPracticalHours(int practicalHours) {
        this.practicalHours = practicalHours;
    }

    public int getLabHours() {
        return labHours;
    }

    public void setLabHours(int labHours) {
        this.labHours = labHours;
    }

    public int getNumberOfTopics() {
        return numberOfTopics;
    }

    public void setNumberOfTopics(int numberOfTopics) {
        this.numberOfTopics = numberOfTopics;
    }

    public Discipline getType() {
        return type;
    }

    public void setType(Discipline type) {
        this.type = type;
    }
}
