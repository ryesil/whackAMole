package javaPractice.ry;

public abstract class AnimalRY {
    private String name;
    private int age;

    public AnimalRY(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    public String getInfo(){
        return "Name: ["+name+"], Age: ["+age+"]";
    }
}
