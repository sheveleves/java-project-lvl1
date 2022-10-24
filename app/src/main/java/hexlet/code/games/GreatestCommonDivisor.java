package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GreatestCommonDivisor {
    public static final int MAX_RANDOM_GCD = 100; //максимальное случайное число
    public static final String GCD_QUESTION = "Find the greatest common divisor of given numbers.";

    //поиск наибольшего общего делителя
    private static int findGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGcd(secondNumber, firstNumber % secondNumber);
    }

    public static void gcd() {
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = RandomUtils.randomNumber(MAX_RANDOM_GCD);
            twoNumber = RandomUtils.randomNumber(MAX_RANDOM_GCD);
            dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber)
                    + " " + Integer.toString(twoNumber);
            dataGame[i][Engine.ANSWER_DATA] = Integer.toString(findGcd(oneNumber, twoNumber));
        }
        Engine.run(dataGame, GCD_QUESTION);
    }
}

