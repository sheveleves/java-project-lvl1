package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even(int sumIterations, String userName) {
        int count = 0; //счетчик количества вводов пользователя
        final int maxRandom = 100; //максимальное случайное число
        boolean userError = false; //флаг - ошибка пользователя
        String correctAnswer; // правильный ответ

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (count < sumIterations && !userError) {
            int randomNumber = Engine.ramdomNumber(maxRandom);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.print("Question: " + randomNumber + "\n"
                    + "Your answer: ");
            String answer = Engine.userStringAnswer();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
                if (count == sumIterations) {
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
