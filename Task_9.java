//  Описание задания
// Напишите программу:
// 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
// 2. Посчитайте среднее арифметическое элементов массива.
// 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое

import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("ведите  размер массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Введите данные с клавиатуры:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();}

        for(int i=0; i < array.length; i++) {
            double average = 0;
            if (array.length > 0)
            {
                double sum = 0;
                for (int j = 0; j < array.length; j++) {
                    sum += array[j];
                }
                average = sum / array.length;
            }
            System.out.println( array[i]* average );
        }
        input.close();
    }
}



