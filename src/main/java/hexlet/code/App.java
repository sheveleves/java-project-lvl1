package hexlet.code;
import hexlet.code.games.Calk;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        String userName; //имя игрока
        final int maxCount = 3; //количество итераций в играх
        final int optionGreet = 1;
        final int optionEven = 2;
        final int optionCalk = 3;
        final int optionGCD = 4;
        final int optionProgression = 5;
        final int optionPrime = 6;
        final int optionExit = 0;


        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        int choose = Engine.userIntAnswer();

        switch (choose) {
            case optionGreet:
                Engine.greeting();
                break;
            case optionEven:
                userName = Engine.greeting();
                Even.even(maxCount, userName);
                break;
            case optionCalk:
                userName = Engine.greeting();
                Calk.calk(maxCount, userName);
                break;
            case optionGCD:
                userName = Engine.greeting();
                Gcd.gcd(maxCount, userName);
            case optionProgression:
                userName = Engine.greeting();
                Progression.progression(maxCount, userName);
                break;
            case optionPrime:
                userName = Engine.greeting();
                Prime.prime(maxCount, userName);
                break;
            case optionExit:
                return;
            default:
        }
    }
}
