import java.util.Scanner;

public class Lesson_1_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(37);
        System.out.println(8 + 3 * 4 / 2 - 1);
        System.out.println(13 % 5); // Остаток поле деления
        // комментарий

        int ageOfMyFriend = 25;
        System.out.println(ageOfMyFriend);
        System.out.println(2025 - ageOfMyFriend);

        int temperature = 20;
        System.out.println(temperature);
        temperature = 31;
        System.out.println(temperature);

        boolean isRainy = false;
        char myFavoriteSymbol = '$';
        float weight = 85.2f;
        long veryBigNumber = 3242342333444L;

        String myCountry = "Kyrgyz Republic";
        System.out.println(veryBigNumber);

        final int FIXED_NUMBER = 70;
        // FIXED_NUMBER = 90;

        // concatenation
        String myLongText = "Lorem Ipsum is simply dummy text of the " +
                            "printing and typesetting industry. " +
                            "Lorem Ipsum has been the industry's standard " +
                            "dummy text ever since the 1500s, when an " +
                            "unknown printer took a galley of type and " +
                            "scrambled it to make a type specimen book.";

        System.out.println("Birth year of my friend: " + (2025 - 25));
        System.out.println("Result: " + 32 + 8);
        System.out.println("Result: " + (32 + 8));

        temperature = 33;
        if (temperature > 30) { // true
            String cinemaTitle = "Cosmo Park";
            System.out.println("Go to the cinema " + cinemaTitle);
        }

        int numberOfStudents = 8;
        if (numberOfStudents >= 10) { // false
            System.out.println("Go to park");
        }

        if (isRainy) { // false
            System.out.println("Take an umbrella");
        } else {
            System.out.println("Take on a hat");
        }

        if (numberOfStudents < 15) { // true
            System.out.println("Go to restaurant");
        } else {
            System.out.println("Go to cafe");
        }

        /*else {
            System.out.println("Do something");
        }*/

        int degrees; // объявление переменной
        System.out.println("Enter a degrees: ");
        Scanner scanner = new Scanner(System.in);
        degrees = scanner.nextInt(); // считываем из консоли число
        // scanner.nextLine(); считываем из консоли текста
        if (degrees > 35) {
            System.out.println("The weather is hot");
        } else if (degrees > 20) {
            System.out.println("The weather is warm");
        } else if (degrees > 10) {
            System.out.println("The weather is cool");
        } else if (degrees > 0) {
            System.out.println("The weather is cold");
        } else {
            System.out.println("The weather is freezing");
        }

        // numberOfStudents = numberOfStudents + 14;
        if (numberOfStudents == 22) {
            System.out.println("Go to picnic");
            if (temperature > 25) {
                System.out.println("Eat an ice-cream");
            } else {
                System.out.println("Drink a hot tea");
            }
        }
    }
}
