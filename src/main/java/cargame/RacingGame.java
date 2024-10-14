package cargame;

import java.util.*;

public class RacingGame {

    private Random random = new Random();
    private Map<String,Integer> result = new HashMap<>();
    private final Cars cars;

    public RacingGame(Cars cars) {
        this.cars = cars;
    }

    public void play(int reps) {
        for (int i = 0; i < reps; i++) {
            List<Car> racingCars = cars.getCars();

            for (Car racingCar : racingCars) {
                int randomNo = random.nextInt(9) + 1;
                int move = racingCar.move(randomNo);
            }
        }
    }
}
