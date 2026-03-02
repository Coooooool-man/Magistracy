package app.factory;

import app.api.Door;
import app.model.door.BathRoomDoor;
import app.model.door.InteriorDoor;

public class DoorFactory {

    public Door createDoor(String typeDoor, int width, int length) {
        if (typeDoor == null) {
            throw new IllegalArgumentException("Тип двери не может быть null");
        } else if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Длина и ширина двери должна быть положительным числом, равно " + width + " " + length);
        }

        Door door = switch (typeDoor.toLowerCase()) {
            case "bathroom" -> new BathRoomDoor();
            case "interior" -> new InteriorDoor();
            default -> throw new IllegalArgumentException("Неизвестный тип двери " + typeDoor);
        };

        door.setWidth(width);
        door.setLength(length);

        return door;
    }
}
