package javaPractice.sn;

public class ProfessorSn extends NewEmployeeSn{

    private String subject;

    public ProfessorSn(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Subject "+ subject;
    }
}
