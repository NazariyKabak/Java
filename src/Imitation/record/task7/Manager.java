package Imitation.record.task7;

public record Manager(CompanyEmployee companyEmployee, String department) {

    @Override
    public String toString() {
        return "Manager{" +
                "companyEmployee=" + companyEmployee +
                ", department='" + department + '\'' +
                '}';
    }
}
