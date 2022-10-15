package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    public static final int MAX_RANDOM_PRIME = 100; //максимальное случайное число

    //определяем простое число или нет
    public static String isPrimeNumber(int number) {
        if (number == 1) {
            return "no";
        }
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

    public static void prime() {
        String[][] dataGame = new String[Engine.MAX_COUNT][2];
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int oneNumber; //первое случайное число
        /*
        Engine.reset();
        while (Engine.count < Engine.maxCount && !Engine.userError) {

         */
        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = RandomUtils.randomNumber(MAX_RANDOM_PRIME) + 1; //не должно быть равно нулю
            dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber);
            dataGame[i][Engine.ANSWER_DATA] = isPrimeNumber(oneNumber);
        }

        Engine.processingAnswer(dataGame);
    }
}

