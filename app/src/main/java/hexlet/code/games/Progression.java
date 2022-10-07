package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int MAX_FIRST_NUMBER = 10; //генерируем первый элемент прогресии
    public static final int MAX_STEP_PROGRESSION = 9; //генерируем максимальный шаг прогрессии
    public static final int MAX_PROGRESS_NUMBER = 10; //количество элементов прогресси

    public static final int MAX_NUMBER_ELEMENT = 9; //макс номер позиции в ряде, который может спрашиваться у игрока

    public static void progression() {
        int firstNumber; //первый элемент прогрессии
        int stepProgression; //шаг арифметической прогресси
        int numberElement; //номер элемента, который будет спрашиваться у игрока
        int[] progressionNumbers = new int[MAX_PROGRESS_NUMBER]; //матрица с 10-ю числами прогрессии
        String[][] dataGame = new String[Engine.MAX_COUNT][2];
        String tempSrting; //строка для формирования

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.MAX_COUNT; i++) {

            //определяем ряд прогресси
            firstNumber = Engine.randomNumber(MAX_FIRST_NUMBER);
            stepProgression = Engine.randomNumber(MAX_STEP_PROGRESSION) + 1;
            //прибавляем 1, чтобы шаг не мог равняться нулю

            for (int j = 0; j < MAX_PROGRESS_NUMBER; j++) {
                if (j == 0) {
                    progressionNumbers[j] = firstNumber;
                } else {
                    progressionNumbers[j] = progressionNumbers[j - 1] + stepProgression;
                }
            }

            //определяем номер элемента в ряде, который будет спрашиваться у игрока
            numberElement = Engine.randomNumber(MAX_NUMBER_ELEMENT);

            tempSrting = "";
            //вывод на эран ряда прогресси
            for (int k = 0; k < MAX_PROGRESS_NUMBER; k++) {
                if (k == numberElement) {
                    tempSrting = tempSrting.concat(".. ");
                } else {
                    tempSrting = tempSrting.concat(Integer.toString(progressionNumbers[k]));
                    tempSrting = tempSrting.concat(" ");
                }
            }
            dataGame[i][Engine.QUESTION_DATA] = tempSrting;
            dataGame[i][Engine.ANSWER_DATA] = Integer.toString(progressionNumbers[numberElement]);
        }
        Engine.processingAnswer(dataGame);
    }
}

