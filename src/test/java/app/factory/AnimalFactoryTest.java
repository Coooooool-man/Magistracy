package app.factory;

import app.api.Animal;

import static java.lang.IO.println;

public class AnimalFactoryTest {
    static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal cat = factory.createAnimal("cat", "Persik", 9);
        Animal dog = factory.createAnimal("dog", "Sharik", 2);
        Animal bird = factory.createAnimal("bird");
        Animal fish = factory.createAnimal("fish");

        println("Имя собаки: " + dog.getName() + ", возраст: " + dog.getAge());
        dog.eat();
        dog.speak();
        println();
        println("Имя кота: " + cat.getName() + ", возраст: " + cat.getAge());
        cat.eat();
        cat.speak();
        println();
        fish.eat();
        fish.speak();
        println();
        bird.eat();
        bird.speak();
        println();

        try {
            Animal mouse = factory.createAnimal("mouse");

        } catch (IllegalArgumentException e) {
            println(e);
        }
    }
}
