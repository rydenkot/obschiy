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