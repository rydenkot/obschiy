
    import java.util.Scanner;
    public class Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число 1:");
            int x = sc.nextInt();
            System.out.println("Введите число 2:");
            int y = sc.nextInt();
            System.out.println("Введите число 3:");
            int z = sc.nextInt();
            double q = 3;
            double r1 = (x+y+z)/q; // либо можно убрать строчку " double q = 3; " и оставить только " double r1 = (x+y+z)/3; "
            System.out.println("Среднее арифметическое: " + r1);
            double r2 = r1/2 ;
            double result = Math.floor(r2);

            if (result > 3) {
                System.out.println( "Программа выполнена корректно");
            }
            else {

            }
            sc.close();


        }
    }
