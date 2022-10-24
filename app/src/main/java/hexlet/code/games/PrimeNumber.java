package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class PrimeNumber {
    public static final int MAX_RANDOM_PRIME = 100; //максимальное случайное число
    public static final String PRIME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    //определяем простое число или нет
    private static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static void prime() {
        String[][] dataGame = new String[Engine.MAX_COUNT][2];
        int oneNumber; //первое случайное число
        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = RandomUtils.randomNumber(MAX_RANDOM_PRIME) + 1; //не должно быть равно нулю
            dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber);
            if (isPrimeNumber(oneNumber)) {
                dataGame[i][Engine.ANSWER_DATA] = "yes";
            } else {
                dataGame[i][Engine.ANSWER_DATA] = "no";
            }
        }

        Engine.run(dataGame, PRIME_QUESTION);
    }
}

