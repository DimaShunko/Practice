package TaskOne;

import java.util.Scanner;

public class One {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = sc.nextInt();

        System.out.println("Введите число b");
        int b = sc.nextInt();

        sc.close();

        System.out.println("Результат деления:" + a / b);
        System.out.println("Остаток от деления:" + a % b);

    }
}
