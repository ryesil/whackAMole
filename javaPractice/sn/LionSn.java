package javaPractice.sn;

public class LionSn extends AnimalSn{
    public LionSn(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
}
