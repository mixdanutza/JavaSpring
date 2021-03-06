package daniela.udemy;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("generator")
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
