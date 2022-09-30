package hexlet.code;

import java.util.Scanner;

public class Games {
    //приветствие
    public static String greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = userStringAnswer();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    //получение строки-ответа, введенного пользователем
    public static String userStringAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //получение числа-ответа, введенного пользователем
    public static int userIntAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void even(String userName) {
        int count = 0; //счетчик количества вводов пользователя
        final int maxCount = 3; //количество вопросов пользователю
        final int maxRandom = 100; //максимальное случайное число
        boolean userError = false; //флаг - ошибка пользователя

        String correctAnswer;

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (count < maxCount && !userError) {
            int randomNumber = (int) (Math.random() * maxRandom);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.print("Question: " + randomNumber + "\n"
                    + "Your answer: ");
            String answer = userStringAnswer();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
                if (count == maxCount) {
                    System.out.println("Congratulations, " + userName);
                }
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "' Let's try again, " + userName + "!");
                userError = true;
            }

        }

    }
}
