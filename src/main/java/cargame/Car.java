package cargame;

public class Car {

    private final String name;
    private int position;

    public Car(final String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("글자수는 0자리이상 5자리 이하로 제한합니다");
        }

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
