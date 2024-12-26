package javaPractice;

public class ManagerSn extends EmployeeSn {
    private double bonus;

    public ManagerSn(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + this.bonus;
    }

}
