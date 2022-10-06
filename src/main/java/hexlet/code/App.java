package hexlet.code;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;
import hexlet.code.games.Calk;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {

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

        int choose = Engine.inputIntAnswer();
        if (choose == 0) {
            return;
        }
        Engine.greeting();
        switch (choose) {
            case optionGreet:
                break;
            case optionEven:
                Even.even();
                break;
            case optionCalk:
                Calk.calk();
                break;
            case optionGCD:
                Gcd.gcd();
                break;
            case optionProgression:
                Progression.progression();
                break;
            case optionPrime:
                Prime.prime();
                break;
            default:
        }
    }
}

