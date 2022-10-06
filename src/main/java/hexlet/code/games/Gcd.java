package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static final int MAX_RANDOM_GCD = 100; //максимальное случайное число

    //поиск наибольшего общего делителя
    public static int findGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGcd(secondNumber, firstNumber % secondNumber);
    }

    public static void gcd() {
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = Engine.randomNumber(MAX_RANDOM_GCD);
            twoNumber = Engine.randomNumber(MAX_RANDOM_GCD);
            dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber)
                    + " " + Integer.toString(twoNumber);
            dataGame[i][Engine.ANSWER_DATA] = Integer.toString(findGcd(oneNumber, twoNumber));
        }
        Engine.processingAnswer(dataGame);
    }
}

