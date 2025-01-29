package javaPractice.ry;

public class UniversityAdminStaffRY extends UniversityEmployeeRY{
    private String department;

    public UniversityAdminStaffRY(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public String getInfo() {
        return "Name: [" + getName() + "], Age: [" + getAge() + "], department: [" + department + "]";
    }
}
