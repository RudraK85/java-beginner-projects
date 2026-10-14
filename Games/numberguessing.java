import java.util.Random;
import java.util.Scanner;

public class numberguessing {
    public static void main(String[] args) {
        System.out.println("    NUMBER GUESSING GAME    ");
        System.out.println("Guess A Number Between 1-100");

        Random random = new Random();
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,101);

        Scanner scanner = new Scanner(System.in);

        do{
           System.out.print("Enter A Guess :");
           guess = scanner.nextInt();
           attempts++;

            if(guess < randomNumber){
            System.out.println("Too Low! Try Again!!");
           }
            else if(guess > randomNumber){
            System.out.println("Too High! Try Again!!");
           }
           else{
            System.out.println("Correct!! The number was " +randomNumber);
            System.out.println("Number Of Attempts :" +attempts);
           }
        }while( guess != randomNumber );
        scanner.close();
        }
    
}
