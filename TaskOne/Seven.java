package TaskOne;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        long a, b, c;
        int k;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = console.nextInt();
        console.close();
        System.out.println(1);
        System.out.println(1);

        a = 1;
        b = 1;
        k = 3;
        while (k <= n){
            c = b + a;
            a = b;
            b = c;
            System.out.println(c);
            k = k + 1;
        }
    }
}
