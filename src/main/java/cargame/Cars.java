package cargame;

import cargame.vo.Name;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String users) {
        cars = new ArrayList<>();

        String[] usersInput = users.split(",");

        for (String user : usersInput) {
            cars.add(new Car(new Name(user)));
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
