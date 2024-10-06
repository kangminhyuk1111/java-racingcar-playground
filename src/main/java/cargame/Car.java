package cargame;

import java.util.Random;

public class Car {

    private static final int FORWARD_NUMBER = 4;
    private int position = 0;
    private final String carName;

    public Car(final String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public void move(int randomNo) {
        if(randomNo >= FORWARD_NUMBER) {
            position++;
        }
    }

    public String getDistance() {
        StringBuilder distance = new StringBuilder();

        for (int i = 0; i < position; i++) {
            distance.append("-");
        }

        return distance.toString();
    }
}
