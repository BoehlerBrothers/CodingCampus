import java.util.Scanner;

/**
 * Concatinate two  inputs. Example is based on the name a user puts in.
 */
public class NameConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Gib bitte deinen Vorname ein.");
        String firstName = scanner.nextLine();

        System.out.println("Gib bitte deinen Nachname ein.");
        String lastName = scanner.nextLine();

        /**
         *  + " " + is used for put in a space between the two strings
         */
        System.out.println("Der Eingegebene Name ist:");
        System.out.println(firstName + " " + lastName);
    }
}
