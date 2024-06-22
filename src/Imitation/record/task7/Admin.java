package Imitation.record.task7;

public record Admin(CompanyEmployee companyEmployee, String department) {

    @Override
    public String toString() {
        return "Admin{" +
                "companyEmployee=" + companyEmployee +
                ", department='" + department + '\'' +
                '}';
    }
}
