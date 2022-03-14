// Описание задания
// Напишите простой калькулятор:
// 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
// 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int x = sc.nextInt();
        System.out.println("Введите число 2:");
        int y = sc.nextInt();
        System.out.println("Введите + - * или /");
        char z = sc.next().charAt(0);
        if (z == '+' ) {
            System.out.println("x+y="+(x+y));
        }
        else if (z == '-' )
        {
            System.out.println("x-y="+(x-y));
        }
        else if (z == '*' )
        {
            System.out.println("x*y="+(x*y));
        }
        else if  (z == '/' )
        {
            System.out.println("x/y="+(x/y));
        }

        sc.close();
    }
}
