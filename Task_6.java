import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = sc.nextInt();
            if (x == 2) {
                System.out.println(" Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int xe = sc.nextInt();
                System.out.println("Введите число");
                int xn = sc.nextInt();
                    if (xe == 1) {
                        System.out.println("Результат: ");
                        System.out.println("Метры: " +xn);
                        System.out.println("Миля: "+xn*(0.00062));
                        System.out.println("Ярд: "+xn*(1.09));
                        System.out.println("Фут: "+xn*(3.28));
                    }
                    else
                        if (xe == 2) {
                            System.out.println("Результат: ");
                            System.out.println("Метры: " +xn*(1609.34));
                            System.out.println("Миля: "+xn);
                            System.out.println("Ярд: "+xn*(1760));
                            System.out.println("Фут: "+xn*(5280));}
                        else
                            if (xe == 3) {
                                System.out.println("Результат: ");
                                System.out.println("Метры: " +xn*(0.91));
                                System.out.println("Миля: "+xn*(0.00057));
                                System.out.println("Ярд: "+xn);
                                System.out.println("Фут: "+xn*(3));}
                             else
                                 if (xe == 4) {
                                   System.out.println("Результат: ");
                                   System.out.println("Метры: " +xn*(0.3));
                                   System.out.println("Миля: "+xn*(0.00019));
                                   System.out.println("Ярд: "+xn*(0.33));
                                   System.out.println("Фут: "+xn);}
                                 else System.out.println("Неправильно введена единица измерения");



            }
            else

                        System.out.println(" Выберите единицу измерения: 1 -  Килограмм, 2 -  Грамм, 3- Центнер, 4 - Пуд");
                        int xe = sc.nextInt();
                        System.out.println("Введите число");
                        int xn = sc.nextInt();
                        if (xe == 1) {
                            System.out.println("Результат: ");
                            System.out.println("Килограмм: " +xn);
                            System.out.println("Грамм: "+xn*(1000));
                            System.out.println("Центнер: "+xn*(0.01));
                            System.out.println("Пуд: "+xn*(16.38));
                        }
                        else
                        if (xe == 2) {
                            System.out.println("Результат: ");
                            System.out.println("Килограмм: " +xn*(0.001));
                            System.out.println("Грамм: "+xn);
                            System.out.println("Центнер: "+xn*(0.00001));
                            System.out.println("Пуд: "+xn*(16380));}
                        else
                        if (xe == 3) {
                            System.out.println("Результат: ");
                            System.out.println("Килограмм: " +xn*(100));
                            System.out.println("Грамм: "+xn*(100000));
                            System.out.println("Центнер: "+xn);
                            System.out.println("Пуд: "+xn*(0.16));}
                        else
                              if (xe == 4) {
                                      System.out.println("Результат: ");
                                      System.out.println("Килограмм: " +xn*(16.38));
                                      System.out.println("Грамм: "+xn*(16380));
                                      System.out.println("Центнер: "+xn*(0.16));
                                      System.out.println("Пуд: "+xn);}
                                                else System.out.println("Неправильно введена единица измерения");

        sc.close();
    }
}
