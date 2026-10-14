import java.util.Scanner;

public class MadLibs_Game {
    public static void main(String[] args) {

        System.out.println("----------- MADLIBS GAME -----------");
        Scanner scanner = new Scanner(System.in);
        String place;
        String noun;
        String adjective;
        String noun1;
        String verb;
        String noun2;
        String adjective1;
 

        System.out.print("ENTER A PLACE NAME:");
        place = scanner.nextLine();
        System.out.print("ENTER A PERSON NAME:");
        noun = scanner.nextLine();
        System.out.print("ENTER A ADJECTIVE:");
        adjective = scanner.nextLine();
        System.out.print("ENTER A ANIMAL NAME:");
        noun1 = scanner.nextLine();
        System.out.print("ENTER A VERB:");
        verb = scanner.nextLine();
        System.out.print("ENTER A FOOD NAME:");
        noun2 = scanner.nextLine();
        System.out.print("ENTER A ADJECTIVE (FOR MOOD):");
        adjective1 = scanner.nextLine();

        System.out.println("Today, I went to the " + place + " with my best friend " + noun +".");
        System.out.println("We saw a " + adjective + " " + noun1 + " jumping around."); 
        System.out.println("Then, we decided to " + verb + " and eat some " + noun2 + ".");
        System.out.println("It was the most " + adjective1 + " day ever!");


        scanner.close();
    }
    
}
