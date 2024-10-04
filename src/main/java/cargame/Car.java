package cargame;

public class Car {

    private static final int FORWARD_NUMBER = 4;
    private int position;
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
}
