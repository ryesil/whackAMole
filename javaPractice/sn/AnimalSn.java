package javaPractice.sn;

public abstract class AnimalSn {

    private String name;
    private int age;

    public AnimalSn(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    public String getInfo(String name, int age){
        return "Name: " + name + " Age: " + age;
    }
}
