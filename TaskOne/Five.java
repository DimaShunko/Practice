package TaskOne;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        int b, c;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = console.nextInt();
        console.close();
        b = a;
        c = 0;
        while (b > 0) {
            c = c + b % 10;
            b = b / 10;
        }
        System.out.println(c);
    }
}
