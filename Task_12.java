// Описание задания
// Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
// 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
// 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
// 3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
// 4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
// 5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).

import java.util.Scanner;
public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите: I like Java!!!");
        String  x = sc.nextLine();
        String s = x.substring(7,11);
        String replStr1 = s.replace('a', 'o');
        if (x.contains("Java")) {
            if (x.startsWith("I like")) {
                if (x.endsWith("!!!")){
                    String result;
                    result = x.toUpperCase();
                    System.out.println(result);
                    System.out.println(replStr1);

                }

            }
        }
        else



        sc.close();
    }
}
