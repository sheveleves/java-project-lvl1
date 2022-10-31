package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    private static final int MAX_RANDOM_CALK = 100; //максимальное случайное число
    private static final int MAX_EXPRESSION = 3; //количество математических выражений (+, -, *)
    private static final String CALCULATOR_QUESTION = "What is the result of the expression?";
    private static final String[] OPERATOR = new String[] {"*", "+", "-"};
    private static int calculateExpression(int numberA, int numberB, String operator) {

        switch (operator) {
            case "*" -> {
                return numberA * numberB;
            }
            case "+" -> {
                return numberA + numberB;
            }
            case "-" -> {
                return numberA - numberB;
            }
            default -> {
                throw new UnsupportedOperationException("This arithmetic expression is not available!");
            }
        }
    }

    public static void runCalk() {
        String mathExpression; //сопоставляется с математическим выражением String expression
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        for (int i = 0; i < Engine.MAX_COUNT; i++) {
            oneNumber = RandomUtils.randomNumber(MAX_RANDOM_CALK);
            twoNumber = RandomUtils.randomNumber(MAX_RANDOM_CALK);
            mathExpression = OPERATOR[RandomUtils.randomNumber(MAX_EXPRESSION)];

            dataGame[i][Engine.QUESTION_DATA] = Integer.toString(oneNumber)
                    + " " + mathExpression + " "
                    + Integer.toString(twoNumber);
            dataGame[i][Engine.ANSWER_DATA] =
                    Integer.toString(calculateExpression(oneNumber, twoNumber, mathExpression));
        }
        Engine.run(dataGame, CALCULATOR_QUESTION);
    }
}

