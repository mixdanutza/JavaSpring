package daniela.udemy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGenerator implements IMessageGenerator {
    private static final Logger logger = LoggerFactory.getLogger(MessageGenerator.class);

    @Autowired
    private Game game;

    private int guessCount = 10;

    @PostConstruct
    public void init(){
        logger.info("Game = {}", game);
    }

    @Override
    public String getMainMessage() {
        return "getMainMessage() called!";
    }

    @Override
    public String getResultMessage() {
        return "getResultMessage() called!";
    }
}
