package hexlet.code.games;

import hexlet.code.Engine;

public class Calk {
    public static void calk(int sumIterations, String userName) {
        final int maxRandom = 100; //максимальное случайное число
        final int maxExpression = 3; //количество математических выражений (+, -, *)
        int oneNumber; //первое случайное число
        int twoNumber; //второе случайное число
        int mathExpression; //сопоставляется с математическим выражением String expression
        int count = 0; //счетчик количества вводов пользователя
        boolean userError = false; //флаг - ошибка пользователя
        int correctAnswer = 0; // правильный ответ
        String expression = "*"; //мат. выражение

        System.out.println("What is the result of the expression?");

        while (count < sumIterations && !userError) {
            System.out.print("Question: ");
            oneNumber = Engine.ramdomNumber(maxRandom);
            twoNumber = Engine.ramdomNumber(maxRandom);
            mathExpression = Engine.ramdomNumber(maxExpression);

            switch (mathExpression) {
                case 0 -> {
                    expression = "*";
                    correctAnswer = oneNumber * twoNumber;
                }
                case 1 -> {
                    expression = "+";
                    correctAnswer = oneNumber + twoNumber;
                }
                case 2 -> {
                    expression = "-";
                    correctAnswer = oneNumber - twoNumber;
                }
            }

            System.out.println(oneNumber + " " + expression + " " + twoNumber);
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
