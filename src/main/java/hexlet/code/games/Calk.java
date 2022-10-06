package hexlet.code.games;

import hexlet.code.Engine;

public class Calk {
    public static final int MAX_RANDOM_CALK = 100; //максимальное случайное число
    public static final int MAX_EXPRESSION = 3; //количество математических выражений (+, -, *)

    public static void calk() {
        int mathExpression; //сопоставляется с математическим выражением String expression
        String expression; //мат. выражение
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = Engine.randomNumber(MAX_RANDOM_CALK);
            twoNumber  = Engine.randomNumber(MAX_RANDOM_CALK);
            mathExpression = Engine.randomNumber(MAX_EXPRESSION);

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
        Engine.processingAnswer(dataGame);
    }
}

