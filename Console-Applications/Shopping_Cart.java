import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shopping_Cart {
    public static void main(String[] args) {

             //SHOPPING CART PROGRAM

        System.out.println("*********** SHOPPING CART ***********");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy ? :");
        String name_of_item = scanner.nextLine();
        
        System.out.print("What price would you choose ? :");
        double price = scanner.nextDouble();

        System.out.print("How many of them would you like ? :");
        int number_of_piece = scanner.nextInt();

        double result = price * number_of_piece; 

        System.out.println("You have bought " + number_of_piece +" " + name_of_item + "/s" + "😊" );
        System.out.println("Your total is " +NumberFormat.getCurrencyInstance(Locale.US).format(result));

        scanner.close();
    }
    
}
