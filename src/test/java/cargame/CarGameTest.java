package cargame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarGameTest {

    private final String users = "kang,min,hyuk";
    private final int retry = 5;
    private final RandomNumberGenerator randomNumberGenerator = new FakeRandomNumberGenerator();

    private CarGame carGame;

    @BeforeEach
    void setUp() {
        carGame = new CarGame(users, retry, randomNumberGenerator);
    }

    @Test
    void 게임_시작() {
        final String[] winners = carGame.start();
        assertThat(winners.length).isEqualTo(1);
    }

    @Test
    void 유저_생성() {
        List<Car> cars = carGame.createUsers(users);
        assertThat(cars.size()).isEqualTo(3);
    }
}
