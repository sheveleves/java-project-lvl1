package hexlet.code;
import hexlet.code.games.Calk;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

public class App {
    public static void main(String[] args) {
        String userName; //имя игрока
        final int maxCount = 3; //количество итераций в играх


        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
                Your choice:\s""");

        int choose = Engine.userIntAnswer();

        switch (choose) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                userName = Engine.greeting();
                Even.even(maxCount, userName);
                break;
            case 3:
                userName = Engine.greeting();
                Calk.calk(maxCount, userName);
                break;
            case 4 :
                userName = Engine.greeting();
                Gcd.gcd(maxCount, userName);
            case 0:
                return;
            default:
        }
    }
}
