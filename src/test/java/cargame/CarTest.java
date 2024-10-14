package cargame;

import cargame.vo.Name;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    final Name name = new Name("k5");
    final Name wrongName = new Name("hyundai");

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
        int move = car.move(4);
        assertThat(move).isEqualTo(1);
    }

    @Test
    void 숫자가_3이상이면_차량_이동() {
        final Car car = new Car(name);
        int move = car.move(4);
        assertThat(move).isEqualTo(1);
    }

    @Test
    void 숫자가_3이하면_차량_정지() {
        final Car car = new Car(name);
        int move = car.move(3);
        assertThat(move).isEqualTo(0);
    }
}
