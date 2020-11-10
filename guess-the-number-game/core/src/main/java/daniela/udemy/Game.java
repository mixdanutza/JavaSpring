package daniela.udemy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game implements IGame {

    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    private NumberGenerator numberGenerator;
    private int guessCount = 10;
    private int number;
    private int guess;
    private int smallest;
    private int biggest;
    private int remainingGuesses;
    private boolean validNumberRange = true;

//    public Game(NumberGenerator numberGenerator) {
//        this.numberGenerator = numberGenerator;
//    }

    public void setNumberGenerator(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void reset() {
        smallest = 0;
        guess = 0;
        remainingGuesses = guessCount;
        biggest = numberGenerator.getMaxNumber();
        number = numberGenerator.next();
        logger.debug("The number is {}", number);
    }
    public int getGuessCount() {
        return guessCount;
    }

    public void setGuessCount(int guessCount) {
        this.guessCount = guessCount;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSmallest(int smallest) {
        this.smallest = smallest;
    }

    public void setBiggest(int biggest) {
        this.biggest = biggest;
    }

    public void setRemainingGuesses(int remainingGuesses) {
        this.remainingGuesses = remainingGuesses;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getGuess() {
        return 0;
    }

    @Override
    public void setGuess(int guess) {

    }

    @Override
    public int getSmallest() {
        return 0;
    }

    @Override
    public int getBiggest() {
        return 0;
    }

    @Override
    public int getRemainingGuesses() {
        return 0;
    }


    @Override
    public void check() {
        checkValidNumberRange();

        if(validNumberRange){
            if(guess>number){
                biggest = guess -1;
            }

            if(guess < number){
                smallest = guess +1;
            }
        }

        remainingGuesses --;
    }

    @Override
    public boolean isValidNumberRange() {
        return validNumberRange;
    }

    @Override
    public boolean isGameWon() {
        return guess == number;
    }

    @Override
    public boolean isGameLost() {
        return !isGameWon() && remainingGuesses <= 0;
    }

    private void checkValidNumberRange(){
        validNumberRange = (guess>= smallest) && (guess <= biggest);
    }




}
