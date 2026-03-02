package app.factory;

import app.api.Animal;
import app.model.animal.Bird;
import app.model.animal.Cat;
import app.model.animal.Dog;
import app.model.animal.Fish;

public class AnimalFactory {
    public Animal createAnimal(String typeAnimal) throws IllegalArgumentException {
        checkTypeAnimal(typeAnimal);
        return switchByTypeAnimal(typeAnimal);
    }

    public Animal createAnimal(String typeAnimal, String name, int age) throws IllegalArgumentException {
        checkTypeAnimal(typeAnimal);
        Animal animal = switchByTypeAnimal(typeAnimal);
        animal.setAge(age);
        animal.setName(name);
        return animal;
    }

    private void checkTypeAnimal(String typeAnimal) throws IllegalArgumentException {
        if (typeAnimal == null) {
            throw new IllegalArgumentException("Тип животного не может быть null");
        }
    }

    private Animal switchByTypeAnimal(String typeAnimal) {
        return switch (typeAnimal) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            case "fish" -> new Fish();
            case "bird" -> new Bird();
            default -> throw new IllegalArgumentException("Неизвестный тип животного: " + typeAnimal);
        };
    }


}
