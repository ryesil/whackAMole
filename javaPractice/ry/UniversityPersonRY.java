package javaPractice.ry;

public class UniversityPersonRY {
    private String name;
    private int age;

    public UniversityPersonRY(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return "Name: [" + name + "], Age: [" + age + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
