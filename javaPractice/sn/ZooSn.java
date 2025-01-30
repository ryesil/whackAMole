package javaPractice.sn;

import java.util.ArrayList;
import java.util.List;

public class ZooSn {

    List<AnimalSn> animals;

    public ZooSn() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(AnimalSn animalSn) {
        animals.add(animalSn);
    }

    public void getAnimalSounds() {
        for (AnimalSn animalSn : animals) {
            System.out.println(animalSn.makeSound());
        }

    }
}
