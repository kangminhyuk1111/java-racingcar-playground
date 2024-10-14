package cargame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    final String name = "k5";

    @Test
    void createCar() {
        final Car car = new Car(name);
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    void carMove() {
        final Car car = new Car(name);
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
