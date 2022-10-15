package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class EvenNumber {
    public static final int MAX_RANDOM_EVEN = 100; //максимальное случайное число
    public static final String EVEN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void even() {
        int oneNumber; //хранит сгенерированное число
        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = RandomUtils.randomNumber(MAX_RANDOM_EVEN);
            dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber);
            if (oneNumber % 2 == 0) {
                dataGame[i][Engine.ANSWER_DATA] = "yes";
            } else {
                dataGame[i][Engine.ANSWER_DATA] = "no";
            }
        }
        Engine.processingAnswer(dataGame, EVEN_QUESTION);
    }
}

