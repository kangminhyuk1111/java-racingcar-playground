package cargame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarGameTest {

    private CarGame carGame;

    @BeforeEach
    void setUp() {
        carGame = new CarGame("kang,min,hyuk", 5);
    }

    @Test
    void 게임_시작() {
        final String[] winners = carGame.start();
        assertThat(winners.length).isEqualTo(1);
    }

    @Test
    void 유저_생성() {
        carGame.createUsers();
    }
}
