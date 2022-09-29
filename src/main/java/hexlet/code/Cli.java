package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = userInput.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
