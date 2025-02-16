package javaPractice.sn;

public class NewEmployeeSn extends NewPersonSn{
    private double salary;

    public NewEmployeeSn(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Salary: $" + salary;
    }
}
