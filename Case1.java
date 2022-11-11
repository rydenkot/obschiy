package org.example;

import java.util.Scanner;

public class Case1 {

    public String enterString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        return scanner.nextLine();

    }

    public int calculate(String str) {
        String[] arr = str.split("");
        int sign;
        int result = 0;

        if (arr[1].equals("+"))
            sign = 1;
        else sign = -1;

        if (arr[0].equals("x"))
            result = Integer.parseInt(arr[4]) - (sign) * Integer.parseInt(arr[2]);
        else if (arr[2].equals("x"))
            result = sign * (Integer.parseInt(arr[4]) - Integer.parseInt(arr[0]));
        else if (arr[4].equals("x"))
            result = Integer.parseInt(arr[0]) + (sign) * Integer.parseInt(arr[2]);

        return result;
    }
}

