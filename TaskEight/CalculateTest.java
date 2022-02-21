package TaskEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void sum() {
        Calculate calculate = new Calculate();
        double a = calculate.Sum(3.0, 1.5);

        assertEquals(4.5, a);
    }

    @Test
    void sub() {
        Calculate calculate = new Calculate();
        double a = calculate.Sub(12.4, 3.6);

        assertEquals(8.8, a);
    }

    @Test
    void mul() {
        Calculate calculate = new Calculate();
        double a = calculate.Mul(5.0, 3.0);
        assertEquals(15, a);
    }

    @Test
    void div() {
        Calculate calculate = new Calculate();
        double a = calculate.Div(2.0, 0.08);

        assertEquals(25, a);
    }
}