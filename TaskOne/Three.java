package TaskOne;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = console.nextLine();
        System.out.println("Введите число:");
        int a = console.nextInt();
        console.close();

        //Для строки
        int i;
        String s;
        i = str.length() - 1;
        s = "";
        while (i >= 0){
            s = s + str.charAt(i);
            i = i - 1;
        }
        if (s.equals(str))
            System.out.println("Строка является палиндромом");
        else
            System.out.println("Строка не является палиндромом");

        //Для числа
        int b, c;
        b = a;
        c = 0;
        while (b > 0){
            c = c * 10 + (b % 10);
            b = b / 10;
        }
        if (c == a)
            System.out.println("Число является палиндромом");
        else
            System.out.println("Число не является палиндромом");
    }
}
