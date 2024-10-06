package cargame;

import java.util.Random;

public class CarGameRandomNumberGenerator implements RandomNumberGenerator{

    private final Random random = new Random();

    @Override
    public int getRandomNumber(int bound) {
        return random.nextInt(9) + 1;
    }
}
