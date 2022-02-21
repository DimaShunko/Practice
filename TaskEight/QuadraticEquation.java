package TaskEight;

import static java.lang.Math.sqrt;

public class QuadraticEquation {

    public static double[] Roots(double a, double b, double c ){

        double D = b*b - 4*a*c;

        if (D > 0){
            double x1 = (-b-sqrt(D))/2*a;
            double x2 = (-b+sqrt(D))/2*a;
            if (x1 >x2){
                double min = x1;
                x1 = x2;
                x2 = min;
            }
            return new double[] {x1, x2};
        }else if (D == 0){
            double x3 = -b/2*a;
            return new double[] {x3};
        }else{
            throw new Error("Нет корней");
        }
    }

}
