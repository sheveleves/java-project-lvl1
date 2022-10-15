package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {
    public static final int MAX_FIRST_NUMBER = 10; //генерируем первый элемент прогресии
    public static final int MAX_STEP_PROGRESSION = 9; //генерируем максимальный шаг прогрессии
    public static final int MAX_PROGRESS_NUMBER = 10; //количество элементов прогресси

    public static final int MAX_NUMBER_ELEMENT = 9; //макс номер позиции в ряде, который может спрашиваться у игрока

    public static int[] createProgressionNumber() {

        int[] progressionNumbers = new int[MAX_PROGRESS_NUMBER]; //матрица с 10-ю числами прогрессии
        int firstNumber; //первый элемент прогрессии
        int stepProgression; //шаг арифметической прогресси

        //определяем ряд прогресси
        firstNumber = RandomUtils.randomNumber(MAX_FIRST_NUMBER);
        stepProgression = RandomUtils.randomNumber(MAX_STEP_PROGRESSION) + 1;
        //прибавляем 1, чтобы шаг не мог равняться нулю

        for (int j = 0; j < MAX_PROGRESS_NUMBER; j++) {
            if (j == 0) {
                progressionNumbers[j] = firstNumber;
            } else {
                progressionNumbers[j] = progressionNumbers[j - 1] + stepProgression;
            }
        }
        return progressionNumbers;
    }

    public static void progression() {

        String[][] dataGame = new String[Engine.MAX_COUNT][2];

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.MAX_COUNT; i++) {

            int[] progressionNumbers = createProgressionNumber();
            //определяем номер элемента в ряде, который будет спрашиваться у игрока
            int numberElement = RandomUtils.randomNumber(MAX_NUMBER_ELEMENT);

            String tempSrting = "";

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
