import java.util.Scanner;

/**
 * Guess the random number with only x tries
 */
public class RandomNumber {
    public static void main(String[] args) {
        int tries = 0;
        int maxTries = 3;
        boolean notCorrect = true;
        int randomZahl = (int)(Math.random() * 100);   //zufallszahl

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        while (tries < maxTries && notCorrect) {
            System.out.println("Gib bitte einen Tip ab.");
            int mytip = scanner.nextInt();
            if (mytip == randomZahl) {
                System.out.println("Gratulation");
                notCorrect = false;
            } else {
                tries = tries + 1;
                if (mytip > randomZahl) {
                    System.out.println("Dein Tip ist zu groß");
                } else {
                    System.out.println("Dein Tip ist zu klein");
                }
            }
        }
        if(!notCorrect){
            System.out.println("Game over. Failed!");
        }
    }
}
