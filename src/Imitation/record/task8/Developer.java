package Imitation.record.task8;

public class Developer {
    private CompanyEmployee companyEmployee;
    private String department;

    public Developer(CompanyEmployee companyEmployee, String department) {
        this.companyEmployee = companyEmployee;
        this.department = department;
    }

    public CompanyEmployee getCompanyEmployee() {
        return companyEmployee;
    }

    public void setCompanyEmployee(CompanyEmployee companyEmployee) {
        this.companyEmployee = companyEmployee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "companyEmployee=" + companyEmployee +
                ", department='" + department + '\'' +
                '}';
    }
}
