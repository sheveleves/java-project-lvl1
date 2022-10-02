package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    //определяем простое число или нет
    public static String isPrimeNumber(int number) {
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return "no";
            } else {
                i++;
            }
        }
        return "yes";
    }
    public static void prime(int sumIterations, String userName) {
        int count = 0; //счетчик количества вводов пользователя
        boolean userError = false; //флаг - ошибка пользователя
        String correctAnswer; // правильный ответ
        int randomNumber; //случайное число
        final int maxRandom = 100; //максимальное случайное число


        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (count < sumIterations && !userError) {
            randomNumber = Engine.ramdomNumber(maxRandom) + 1; //не должно быть равно нулю
            correctAnswer = isPrimeNumber(randomNumber);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
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
