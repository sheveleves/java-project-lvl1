package hexlet.code;

import java.util.Scanner;

public class Engine {
    //получение строки-ответа, введенного пользователем
    public static String userStringAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //получение числа-ответа, введенного пользователем
    public static int userIntAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    //приветствие
    public static String greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = userStringAnswer();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    //получение слуайного числа
    public static int ramdomNumber(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }
}
