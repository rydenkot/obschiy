// Описание задания
// Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.

    import java.util.Scanner;

    public class Task_8 {

        public static void main(String[] args) {
            System.out.print("Введите любое целое положительное число: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i<= n;  i++){

                    if (i % 2 != 0)  {
                        sum = sum + i;
                    }
            }
            System.out.println (sum);
            sc.close();
        }
    }

