package daniela.udemy;

import java.util.Random;

public class NumberGenerator implements INumberGenerator{

    private static final Random random = new Random();

    private int maxNumber = 100;
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
