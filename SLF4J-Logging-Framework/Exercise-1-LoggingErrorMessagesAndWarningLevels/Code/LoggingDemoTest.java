package spring_learn;

import org.junit.jupiter.api.Test;

public class LoggingDemoTest {

    @Test
    public void testLogging() {
        LoggingDemo demo = new LoggingDemo();
        demo.performTask();
    }
}