package hexlet.code;
import hexlet.code.games.EvenNumber;
import hexlet.code.games.Calculator;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;


public class App {
    static  final int OPTION_GREET = 1;
    static final int OPTION_EVEN_NUMBER = 2;
    static final int OPTION_CALCULATOR = 3;
    static final int OPTION_GREATEST_COMMON_DIVISOR = 4;
    static final int OPTION_PROGRESSION = 5;
    static final int OPTION_PRIME_NUMBER = 6;

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
            case OPTION_EVEN_NUMBER:
                EvenNumber.even();
                break;
            case OPTION_CALCULATOR:
                Calculator.calk();
                break;
            case OPTION_GREATEST_COMMON_DIVISOR:
                GreatestCommonDivisor.gcd();
                break;
            case OPTION_PROGRESSION:
                Progression.progression();
                break;
            case OPTION_PRIME_NUMBER:
                PrimeNumber.prime();
                break;
            default:
        }
    }
}

