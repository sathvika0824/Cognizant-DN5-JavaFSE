package spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public void performTask() {
        logger.warn("This is a warning message: task is taking longer than expected");
        logger.error("This is an error message: task failed to complete");
    }
}