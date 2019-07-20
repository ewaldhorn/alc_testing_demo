package android.testing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void twiceTheNumber() {
        assertEquals(2, calculator.twiceTheNumber(1));
        assertEquals(20, calculator.twiceTheNumber(10));
        assertEquals(200, calculator.twiceTheNumber(100));
        assertEquals(2000, calculator.twiceTheNumber(1000));
        assertEquals(20000, calculator.twiceTheNumber(10000));
        assertEquals(200000, calculator.twiceTheNumber(100000));
        assertEquals(2000000, calculator.twiceTheNumber(1000000));
    }

    @Test
    public void halfTheNumber() {
        assertEquals(1000000, calculator.halfTheNumber(2000000));
        assertEquals(100000, calculator.halfTheNumber(200000));
        assertEquals(10000, calculator.halfTheNumber(20000));
        assertEquals(1000, calculator.halfTheNumber(2000));
        assertEquals(100, calculator.halfTheNumber(200));
        assertEquals(10, calculator.halfTheNumber(20));
        assertEquals(1, calculator.halfTheNumber(2));
    }
}