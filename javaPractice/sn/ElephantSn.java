package javaPractice.sn;

public class ElephantSn extends AnimalSn{
    public ElephantSn(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Trumpet!";
    }
}
