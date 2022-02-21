package TaskOne;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение weekday (true или false):");
        Boolean weekday = in.nextBoolean();

        System.out.println("Введите значение vocation (true или false):");
        Boolean vocation  = in.nextBoolean();

        in.close();

        if ((!weekday) | (vocation)) {
            System.out.println("True");
        }else
            System.out.println("False");
    }
}
