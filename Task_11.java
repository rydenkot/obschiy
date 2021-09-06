import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        String xs = sc.nextLine();
        int x = Integer.parseInt(xs.trim());
        System.out.println("Введите число");
        int xr = sc.nextInt();
        int resultInt = Math.max(x, xr);
        double resultDouble = Math.min(x, xr);
        System.out.println("Большее " + resultInt);
        System.out.println("Меньшее " + resultDouble);

    }
}
