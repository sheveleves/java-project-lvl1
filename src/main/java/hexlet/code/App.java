package hexlet.code;
import hexlet.code.games.Calk;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        String userName; //имя игрока
        final int maxCount = 3; //количество итераций в играх


        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n"
                + "Your choice: ");

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
            case 0:
                return;
            default:
        }
    }
}
