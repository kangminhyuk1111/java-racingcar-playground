package cargame;

import org.junit.jupiter.api.Test;

public class RacingGameTest {

    @Test
    void 게임_생성() {
        String users = "pobi,crong,honux";
        Cars cars = new Cars(users);
        RacingGame racingGame = new RacingGame(cars);

        racingGame.play(5);
    }
}
