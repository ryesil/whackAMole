package javaPractice.sn;

public class NewPersonSn {
    private String name;
    private int age;


    public NewPersonSn(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}

