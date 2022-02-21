package TaskEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void roots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double[] x = quadraticEquation.Roots(1,4,4);

        int n = x.length;

        if (n == 2){
            assertArrayEquals(new double[]{2, 5}, x);
        }else{
            assertArrayEquals(new double[]{-2}, x);
        }
    }
}