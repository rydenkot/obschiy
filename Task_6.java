import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println(" Выберите единицу измерения: 1 -  Килограмм, 2 -  Грамм, 3- Центнер, 4 - Пуд");
                int xr = sc.nextInt();
                System.out.println("Введите число");
                int xt = sc.nextInt();switch (xr) {
                case 1:
                    System.out.println("Результат: ");
                    System.out.println("Килограмм: " + xt);
                    System.out.println("Грамм: " + xt * (1000));
                    System.out.println("Центнер: " + xt * (0.01));
                    System.out.println("Пуд: " + xt * (0.061));
                    break;
                case 2:
                    System.out.println("Результат: ");
                    System.out.println("Килограмм: " + xt * (0.001));
                    System.out.println("Грамм: " + xt);
                    System.out.println("Центнер: " + xt * (0.00001));
                    System.out.println("Пуд: " + xt * (0.000061));
                    break;
                case 3:
                    System.out.println("Результат: ");
                    System.out.println("Килограмм: " + xt * (100));
                    System.out.println("Грамм: " + xt * (100000));
                    System.out.println("Центнер: " + xt);
                    System.out.println("Пуд: " + xt * (6.11));
                    break;
                case 4:
                    System.out.println("Результат: ");
                    System.out.println("Килограмм: " + xt * (16.38));
                    System.out.println("Грамм: " + xt * (16380));
                    System.out.println("Центнер: " + xt * (0.16));
                    System.out.println("Пуд: " + xt);
                    break;
                default:
                    System.out.println("Неправильно введена единица измерения");
                    break;

            }
                break;
            case 2:
                System.out.println(" Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int xe = sc.nextInt();
                System.out.println("Введите число");
                int xn = sc.nextInt();
                switch (xe) {
                    case 1:
                        System.out.println("Результат: ");
                        System.out.println("Метры: " + xn);
                        System.out.println("Миля: " + xn * (0.00062));
                        System.out.println("Ярд: " + xn * (1.09));
                        System.out.println("Фут: " + xn * (3.28));
                        break;
                    case 2:
                        System.out.println("Результат: ");
                        System.out.println("Метры: " + xn * (1609.34));
                        System.out.println("Миля: " + xn);
                        System.out.println("Ярд: " + xn * (1760));
                        System.out.println("Фут: " + xn * (5280));
                        break;
                    case 3:
                        System.out.println("Результат: ");
                        System.out.println("Метры: " + xn * (0.91));
                        System.out.println("Миля: " + xn * (0.00057));
                        System.out.println("Ярд: " + xn);
                        System.out.println("Фут: " + xn * (3));
                        break;
                    case 4:
                        System.out.println("Результат: ");
                        System.out.println("Метры: " + xn * (0.3));
                        System.out.println("Миля: " + xn * (0.00019));
                        System.out.println("Ярд: " + xn * (0.33));
                        System.out.println("Фут: " + xn);
                        break;
                    default:
                        System.out.println("Неправильно введена единица измерения");
                        break;
                }

                break;



        }
            sc.close();
        }
    }

