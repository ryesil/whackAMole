package javaPractice.ry;

import java.util.ArrayList;
import java.util.List;

public class ZooRY {
    private List<AnimalRY> animals = new ArrayList<>();

    public void addAnimal(AnimalRY animal) {
        animals.add(animal);
    }

    public String animalSounds() {
        return animals.stream().map(AnimalRY::makeSound).reduce("",(acc, curr)-> acc += curr);
    }
}
