package javaPractice.ry;

public class ElephantRY extends AnimalRY{


    public ElephantRY(String name, int age){
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Trumpet!";
    }
}
