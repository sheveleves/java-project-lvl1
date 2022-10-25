package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String greeting() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = userInput.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
