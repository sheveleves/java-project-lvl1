package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    public static final int MAX_RANDOM_CALK = 100; //максимальное случайное число
    public static final int MAX_EXPRESSION = 3; //количество математических выражений (+, -, *)
    public static final String CALCULATOR_QUESTION = "What is the result of the expression?";

    public static void calk() {
        int mathExpression; //сопоставляется с математическим выражением String expression
        String expression; //мат. выражение
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = RandomUtils.randomNumber(MAX_RANDOM_CALK);
            twoNumber  = RandomUtils.randomNumber(MAX_RANDOM_CALK);
            mathExpression = RandomUtils.randomNumber(MAX_EXPRESSION);

            switch (mathExpression) {
                case 0 -> {
                    expression = " * ";
                    dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber)
                            + expression
                            + Integer.toString(twoNumber);
                    dataGame[i][Engine.ANSWER_DATA] = Integer.toString(oneNumber * twoNumber);
                }
                case 1 -> {
                    expression = " + ";
                    dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber)
                            + expression
                            + Integer.toString(twoNumber);
                    dataGame[i][Engine.ANSWER_DATA] = Integer.toString(oneNumber + twoNumber);
                }
                case 2 -> {
                    expression = " - ";
                    dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber)
                            + expression
                            + Integer.toString(twoNumber);
                    dataGame[i][Engine.ANSWER_DATA] = Integer.toString(oneNumber - twoNumber);
                }
                default -> {
                }
            }
        }
        Engine.processingAnswer(dataGame, CALCULATOR_QUESTION);
    }
}

