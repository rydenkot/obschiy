// Описание задания
// Напишите программу:
// 1. Пользователь вводит размер массива и данные с клавиатуры в массив
// 2. Сравнить элементы массива с заранее заданными константами x, y, z.
// 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        
import java.util.Scanner;
public class Task_7 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 5;
        int y = 7;
        int z = 2;
        System.out.println("ведите  размер массива: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Введите данные с клавиатуры:");
        
        for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); 
                if (array[i]==x || array[i]==y ||array[i]==z ){
                        System.out.print("Данное значение имеется в константах");
                }
                        }
        System.out.println();
        input.close();
        }
}
