package app.model.animal;

import app.api.Animal;

import static java.lang.IO.println;

public class Cat implements Animal {

    private String name;
    private int age;

    @Override
    public void eat() {
        println("Кот ест рыбу");
    }

    @Override
    public void speak() {
        println("Кот мяукает");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
