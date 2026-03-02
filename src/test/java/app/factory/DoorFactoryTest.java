package app.factory;

import app.api.Door;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class DoorFactoryTest {
    static void main(String[] args) {
        DoorFactory doorFactory = new DoorFactory();
        Door bathDoor = doorFactory.createDoor("bathroom", 12, 30);
        Door interiorDoor = doorFactory.createDoor("interior", 50, 100);

        println("Длина и ширина двери санузел: ");
        print(bathDoor.getLength() + " " + bathDoor.getWidth());
        println();
        println("Длина и ширина межкомнатной двери ");
        print(interiorDoor.getLength() + " " + interiorDoor.getWidth());
        println();

        try {
            Door fooDoor = doorFactory.createDoor("foo", 12, 30);

        } catch (IllegalArgumentException e) {
            println(e);
        }

        try {
            Door fooDoor = doorFactory.createDoor("bath", 0, 30);

        } catch (IllegalArgumentException e) {
            println(e);
        }

        try {
            Door fooDoor = doorFactory.createDoor("bath", -12, 30);
        } catch (IllegalArgumentException e) {
            println(e);
        }

    }
}
