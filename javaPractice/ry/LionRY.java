package javaPractice.ry;

public class LionRY extends AnimalRY{


    public LionRY(String name, int age){
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
}
