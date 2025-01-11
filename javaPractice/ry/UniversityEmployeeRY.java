package javaPractice.ry;

public class UniversityEmployeeRY  extends UniversityPersonRY{
    private double salary;

    public UniversityEmployeeRY( String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return  salary;
    }


}
