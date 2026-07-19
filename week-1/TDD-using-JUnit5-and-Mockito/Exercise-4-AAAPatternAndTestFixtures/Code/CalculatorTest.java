package spring_learn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Setup before each test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Teardown after each test");
    }

    @Test
    public void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 5, b = 3;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 5, b = 3;
        // Act
        int result = calculator.subtract(a, b);
        // Assert
        assertEquals(2, result);
    }
}