package javaPractice.ry;

public class EmployeeRY {
    private String name;
    private double baseSalary;

    public EmployeeRY(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }
}
