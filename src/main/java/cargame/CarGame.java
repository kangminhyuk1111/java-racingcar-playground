package cargame;

import java.util.ArrayList;
import java.util.List;

public class CarGame {

    private final List<Car> users;
    private final int retry;
    private final RandomNumberGenerator randomNumberGenerator;

    public CarGame(final String users, final int retry, RandomNumberGenerator randomNumberGenerator) {
        this.users = createUsers(users);
        this.retry = retry;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public String[] start() {
        for (int i = 0; i < retry; i++) {
            for (Car user : users) {
                user.move(randomNumberGenerator.getRandomNumber(8));
            }
        }
    }

    public List<Car> createUsers(final String users) {
        List<Car> cars = new ArrayList<>();
        final String[] split = users.split(",");

        for (String user : split) {
            cars.add(new Car(user));
        }

        return cars;
    }
}
