import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
@Test
public void testFactorialOfZero() {
    assertEquals(1, FactorialCalculator.factorial(0));
}
@Test
public void testFactorialOfPositiveNumber() {
    assertEquals(120, FactorialCalculator.factorial(5));
}
@Test
public void testFactorialOfOne() {
    assertEquals(1, FactorialCalculator.factorial(1));
}
@Test
public void testFactorialOfNegativeNumber() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        FactorialCalculator.factorial(-1);
    });
    assertEquals("Факториал отрицательного числа не определён.", exception.getMessage());
}
}