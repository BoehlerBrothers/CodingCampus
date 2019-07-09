import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;
        int initialCode = 1234;
        int moneyOnTheBank = 4321;
        int trie = 0;

        while(!isDone && trie < 3) {
            System.out.println("Code eingeben. Versuch: " +  (trie +1));
            int inputCode = scanner.nextInt();
            /**
             * Check input code
             */
            if(inputCode == initialCode) {
                System.out.println("Code angenommen");
                /**
                 * Input User amount -> validated
                 */
                System.out.println("Gib bitte den gewünschten Betrag ein.");
                int amount = scanner.nextInt();
                if(amount <= moneyOnTheBank) {
                    System.out.println("Jow! your Rich now. Take the money");
                    isDone = true;
                } else {
                    System.out.println("Your to poor girl/boyz!");
                    isDone = true;
                }
            }
            trie++;
        }
        if(!isDone){
            System.out.println("Code falsch. nub");
        }
    }
}
