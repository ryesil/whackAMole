package javaPractice.ry;

public class DeveloperRY extends EmployeeRY {
    private int projectCount;

    public DeveloperRY(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (projectCount * 1000);
    }
}