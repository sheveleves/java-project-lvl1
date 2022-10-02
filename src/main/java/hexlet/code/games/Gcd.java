package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    //поиск наибольшего общего делителя
    public static int findGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGcd(secondNumber, firstNumber % secondNumber);
    }

    public static void gcd(int sumIterations, String userName) {
        final int maxRandom = 100; //максимальное случайное число
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        int count = 0; //счетчик количества вводов пользователя
        boolean userError = false; //флаг - ошибка пользователя
        int correctAnswer; // правильный ответ

        System.out.println("Find the greatest common divisor of given numbers.");
        while (count < sumIterations && !userError) {
            System.out.print("Question: ");
            oneNumber = Engine.ramdomNumber(maxRandom);
            twoNumber = Engine.ramdomNumber(maxRandom);
            correctAnswer = findGcd(oneNumber, twoNumber);
            System.out.println(oneNumber + " " + twoNumber);
            System.out.print("Your answer: ");
            int answer = Engine.userIntAnswer();

            if (answer == correctAnswer) {
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
