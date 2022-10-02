package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void progression(int sumIterations, String userName) {
        int count = 0; //счетчик количества вводов пользователя
        boolean userError = false; //флаг - ошибка пользователя
        int firstNumber; //первый элемент прогрессии
        final int maxFirstNumber = 10; //максимальный первый элемент прогресии
        int stepProgression; //шаг арифметической прогресси
        final int maxStepProgression = 9; //определяет максимальный шаг прогрессии
        final int maxProgressionNumber = 10; //количество элементов прогресси
        int numberElement; //номер элемента, который будет спрашиваться у игрока
        final int maxNumberElement = 9; //максимальный номер позиции в ряде, который может спрашиваться у игрока
        int correctAnswer; // правильный ответ
        int[] progressionNumbers = new int[maxProgressionNumber]; //матрица с 10-ю числами прогрессии

        System.out.println("What number is missing in the progression?");
        while (count < sumIterations && !userError) {
            System.out.print("Question: ");

            //определяем ряд прогресси
            firstNumber = Engine.ramdomNumber(maxFirstNumber);
            stepProgression = Engine.ramdomNumber(maxStepProgression) + 1;
            //прибавляем 1, чтобы шаг не мог равняться нулю

            for (int i = 0; i < maxProgressionNumber; i++) {
                if (i == 0) {
                    progressionNumbers[i] = firstNumber;
                } else {
                    progressionNumbers[i] = progressionNumbers[i - 1] + stepProgression;
                }
            }

            //определяем номер элемента в ряде, который будет спрашиваться у игрока
            numberElement = Engine.ramdomNumber(maxNumberElement);
            correctAnswer = progressionNumbers[numberElement];

            //вывод на эран ряда прогресси
            for (int i = 0; i < maxProgressionNumber; i++) {
                if (i == numberElement) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progressionNumbers[i] + " ");
                }
            }

            System.out.print("\nYour answer: ");
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
