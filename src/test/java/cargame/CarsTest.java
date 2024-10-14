package cargame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void 레이서_생성() {
        String users = "pobi,crong,honux";
        Cars cars = new Cars(users);
        Assertions.assertThat(cars.getCars().size()).isEqualTo(3);
    }

    @Test
    void 레이서_생성_오류() {
        String users = "pobi,crong,honux";
        Cars cars = new Cars(users);
        Assertions.assertThat(cars.getCars().size()).isEqualTo(3);
    }
}
