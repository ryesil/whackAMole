package javaPractice.ry;

public class UniversityProfRY extends UniversityEmployeeRY{
    private String subject;

    public UniversityProfRY(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }


    @Override
    public String getInfo() {
        return "Name: [" + getName() + "], Age: [" + getAge() + "], subject: [" +subject + "]";
    }
}
