// Описание задания
// Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой 
// строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

import java.util.Scanner;

    public class Task_10 {

        // Функция для чтения матрицы

        public static void readMatrixByUser()

        {
            int m, n, i, j;
            Scanner in = null;
            try {
                in = new Scanner(System.in);
                System.out.println("Введите количество строк матрицы");
                m = in.nextInt();
                System.out.println("Введите количество столбцов матрицы");
                n = in.nextInt();
                // Объявляем матрицу
                int first[][] = new int[m][n];
                // Чтение значений матрицы
                System.out.println("Введите элементы матрицы");
                for (i = 0; i < m; i++)
                    for (j = 0; j < n; j++)
                        first[i][j] = in.nextInt();
                // Отображение элементов матрицы
                System.out.println("Первая строка матрицы умноженная на 3");
                for (i = 0; i < 1; i++) {
                    for (j = 0; j < n; j++)
                        System.out.print(first[i][j] *3 + "  ");
                    System.out.println();
                }
            }
            catch (Exception e) {
            }
            finally {
                in.close();
            }

        }
        // Код драйвера
        public static void main(String[] args)
        {
            readMatrixByUser();
        }
    }

