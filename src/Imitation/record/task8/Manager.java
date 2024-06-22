package Imitation.record.task8;

public class Manager {
    private CompanyEmployee companyEmployee;
    private String department;

    public Manager(CompanyEmployee companyEmployee, String department) {
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
        return "Manager{" +
                "companyEmployee=" + companyEmployee +
                ", department='" + department + '\'' +
                '}';
    }
}
