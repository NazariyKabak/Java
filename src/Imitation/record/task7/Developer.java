package Imitation.record.task7;

public record Developer(CompanyEmployee companyEmployee, String department) {
    @Override
    public String toString() {
        return "Developer{" +
                "companyEmployee=" + companyEmployee +
                ", department='" + department + '\'' +
                '}';
    }
}
