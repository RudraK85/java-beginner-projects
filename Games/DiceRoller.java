import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter The Number Of Dice To Roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice>0){
            for(int i=0;i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You Rolled: " + roll);
                total = total + roll;
            }
            System.out.println("Total: " + total);

        }
        else{
            System.out.println("Number Of Dice Must Be Greater Than Zero...");
        }



        scanner.close();
    }
    static void printDie(int roll){
       String Dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;;
        String Dice2 = """
                 -------
                |●      |
                |       |
                |      ●|
                 -------
                """;;
        String Dice3 = """
                 -------
                |●      |
                |   ●   |
                |      ●|
                 -------
                """;;
        String Dice4 = """
                 -------
                |●     ●|
                |       |
                |●     ●|
                 -------
                """;;
        String Dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
                """;;
        String Dice6 = """
                 -------
                |●     ●|
                |●     ●|
                |●     ●|
                 -------
                """;;
        
        switch (roll) {
            case 1 -> System.out.print(Dice1);
            case 2 -> System.out.print(Dice2);
            case 3 -> System.out.print(Dice3);
            case 4 -> System.out.print(Dice4);
            case 5 -> System.out.print(Dice5);
            case 6 -> System.out.print(Dice6);
            default -> System.out.println("Invalid Roll");
        }        
    }
}
