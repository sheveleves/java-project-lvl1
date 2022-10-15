package hexlet.code;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;
import hexlet.code.games.Calk;
import hexlet.code.games.Progression;

public class App {
    static  final int OPTION_GREET = 1;
    static final int OPTION_EVEN = 2;
    static final int OPTION_CALK = 3;
    static final int OPTION_GCD = 4;
    static final int OPTION_PROGRESSION = 5;
    static final int OPTION_PRIME = 6;

    public static void main(String[] args) {
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
            case OPTION_GREET:
                break;
            case OPTION_EVEN:
                Even.even();
                break;
            case OPTION_CALK:
                Calk.calk();
                break;
            case OPTION_GCD:
                Gcd.gcd();
                break;
            case OPTION_PROGRESSION:
                Progression.progression();
                break;
            case OPTION_PRIME:
                Prime.prime();
                break;
            default:
        }
    }
}

