package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_COUNT = 3; //количество итераций в играх
    public static final int QUESTION_DATA = 0; //в первой позиции храним данные
    public static final int ANSWER_DATA = 1; //во второй позиции храним правильный ответ
    private static String userName; //имя игрока


    //получение строки-ответа, введенного пользователем
    public static String inputStringAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //получение числа-ответа, введенного пользователем
    public static int inputIntAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    //приветствие
    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = inputStringAnswer();
        System.out.println("Hello, " + userName + "!");

    }

    public static void processingAnswer(String[][] dataGame, String taskDescription) {
        int count; //счетчик количества пройдойденных этапов игры
        String userAnswer; //ответ пользователя
        count = 0;

        System.out.println(taskDescription);
        while (count < Engine.MAX_COUNT) {
            System.out.print("Question: " + dataGame[count][QUESTION_DATA]);

            System.out.print("\nYour answer: ");
            userAnswer = inputStringAnswer();
            if (userAnswer.equals(dataGame[count][ANSWER_DATA])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + dataGame[count][ANSWER_DATA] + "'. Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

