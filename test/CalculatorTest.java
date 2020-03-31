import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        int firstNumber = 1;
        int secondNumber = 1;
        int expected = 2;
        int actual = Calculator.plusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd1() {
        int firstNumber = -1;
        int secondNumber = -1;
        int expected = -2;
        int actual = Calculator.plusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd2() {
        int firstNumber = -1;
        int secondNumber = 1;
        int expected = 0;
        int actual = Calculator.plusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd3() {
        int firstNumber = 1;
        int secondNumber = -1;
        int expected = 0;
        int actual = Calculator.plusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testSub() {
        int firstNumber = 1;
        int secondNumber = 1;
        int expected = 0;
        int actual = Calculator.minusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testSub1() {
        int firstNumber = 0;
        int secondNumber = 1;
        int expected = -1;
        int actual = Calculator.minusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testSub2() {
        int firstNumber = 1;
        int secondNumber = -1;
        int expected = 2;
        int actual = Calculator.minusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testSub3() {
        int firstNumber = -1;
        int secondNumber = 1;
        int expected = -2;
        int actual = Calculator.minusNumber(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}