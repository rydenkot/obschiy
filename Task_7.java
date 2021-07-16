import java.util.Scanner;
public class Task_7 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        int x = 5;
        int y = 7;
        int z = 2;
        System.out.println("ведите  размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите данные с клавиатуры:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
                if (array[i]==x || array[i]==y ||array[i]==z ){
                        System.out.print("Данное значение имеется в константах");
                }
                        }
        System.out.println();
        input.close();
        }
}
