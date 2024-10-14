package cargame;

public class Car {

    private final String name;
    private int position;

    public Car(final String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move() {
        position++;
    }
}
