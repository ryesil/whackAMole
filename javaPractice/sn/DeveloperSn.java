package javaPractice.sn;

public class DeveloperSn extends EmployeeSn {
    private int projectCount;

    public DeveloperSn(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + (projectCount*1000);
    }
}
