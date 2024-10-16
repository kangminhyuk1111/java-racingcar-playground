package cargame;

import cargame.vo.Name;
import cargame.vo.Position;

public class Car {

    private final Name name;
    private Position position;

    public Car(final Name name) {
        this.name = name;
        this.position = new Position(0);
    }

    public Name getName() {
        return this.name;
    }

    public int move(final int no) {
        return position.move(no);
    }
}
