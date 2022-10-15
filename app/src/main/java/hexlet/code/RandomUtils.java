package hexlet.code;

public class RandomUtils {
    //получение слуайного числа
    public static int randomNumber(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }
}
