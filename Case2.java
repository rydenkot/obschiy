package org.example;

import java.util.Scanner;

public class Case2 {

    public final String STR = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
    private final String CORRECT_ANSWER = "Заархивированный вирус";

    private String answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ответ");

        return scanner.nextLine();
    }

    public void calculateAnswer() {
        boolean exit = false;
        String answer;
        for (int i = 0; i < 3; i++) {
            if (exit)
                break;
            answer = answer();

            switch (answer) {
                case (CORRECT_ANSWER): {
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                }
                case ("Подсказка"): {
                    if (i == 0) {
                        System.out.println("Правильный ответ: Заархивированный вирус");
                    } else {
                        System.out.println("Подсказка уже недоступна");
                    }
                    continue;
                }
                default: {
                    if (i == 0 || i == 1) {
                        System.out.println("Подумай еще!");
                    }
                }
            }
        }
        if (!exit) {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}




