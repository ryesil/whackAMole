package javaPractice.ry;

public class ManagerRY extends EmployeeRY {
    private double bonus;

    public ManagerRY(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}