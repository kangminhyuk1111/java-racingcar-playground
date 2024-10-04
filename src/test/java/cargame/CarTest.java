package cargame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private static final String CAR_NAME = "pobi";
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(CAR_NAME);
    }

    @Test
    void 차_생성() {
        assertThat(car).isNotNull();
        assertThat(car.getCarName()).isEqualTo(CAR_NAME);
    }

    @Test
    void 차_이동() {
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 차_이동_실패() {
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
