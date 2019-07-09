import java.util.Scanner;

/**
 * Enter two numbers, this two numbers will we added
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Gib bitte Zahl 1 ein.");
        int number1 = scanner.nextInt();

        System.out.println("Gib bitte Zahl 2 ein.");
        int number2 = scanner.nextInt();

        /**
         *  + " " + is used for put in a space between the two strings
         */
        System.out.println("Die Addition der beiden Zahlen ergibt:");
        System.out.println(number1 + number2);
    }
}
