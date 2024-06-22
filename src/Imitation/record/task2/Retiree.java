package Imitation.record.task2;

public class Retiree {
    private Person person;
    private int retirementAhe;
    private double pension;

    public Retiree(Person person, int retirementAhe, double pension) {
        this.person = person;
        this.retirementAhe = retirementAhe;
        this.pension = pension;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getRetirementAhe() {
        return retirementAhe;
    }

    public void setRetirementAhe(int retirementAhe) {
        this.retirementAhe = retirementAhe;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public String toString() {
        return "Retiree{" +
                "person=" + person +
                ", retirementAhe=" + retirementAhe +
                ", pension=" + pension +
                '}';
    }
}
