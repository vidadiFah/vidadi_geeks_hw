import java.util.Scanner;

public class vidadi_fakhraziev_hw_1 {
    public static void main(String[] args) {
        String workerName;
        final int NUM = 10;
        String word = "House";

        workerName = NUM + word;

        System.out.println(workerName);
        System.out.println(NUM);
        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        String name;
        System.out.print("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}
