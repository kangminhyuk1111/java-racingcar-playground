package cargame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    final String name = "k5";
    final String wrongName = "hyundai";

    @Test
    void 차량_생성() {
        final Car car = new Car(name);
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    void 차량_생성시_글자수_제한_오류() {
        assertThatThrownBy(() -> new Car(wrongName)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 차량_이동() {
        final Car car = new Car(name);
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
