package cargame;

public class FakeRandomNumberGenerator implements RandomNumberGenerator{

    @Override
    public int getRandomNumber(int bound) {
        return bound;
    }
}
