package hexlet.code;

public class App {
    public static void main(String[] args) {
        String userName; //имя игрока


        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice: ");

        int choose = Games.userIntAnswer();

        switch (choose) {
            case 1:
                Games.greeting();
                break;
            case 2:
                userName = Games.greeting();
                Games.even(userName);
                break;
            case 0:
                return;
            default:
        }
    }
}
