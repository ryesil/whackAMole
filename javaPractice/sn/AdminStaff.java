package javaPractice.sn;

public class AdminStaff extends NewEmployeeSn{
    private String department;

    public AdminStaff(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department =department;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Department "+ department;
    }
}
