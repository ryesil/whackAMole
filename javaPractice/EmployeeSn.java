package javaPractice;

public class EmployeeSn {
    private String name;
    private double baseSalary;

    public EmployeeSn(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public EmployeeSn setName(String name) {
        this.name = name;
        return this;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public EmployeeSn setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }
}
