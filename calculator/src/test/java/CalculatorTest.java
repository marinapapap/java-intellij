import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test public void testAddsTwoAndTwo() {
        Calculator calc = new Calculator();
        assertEquals(Integer.valueOf(4), calc.add(2, 2));
    }
}