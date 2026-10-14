import java.util.Scanner;

public class SimpleBanking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
        System.out.println("\n\n***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1.Show Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("***************");

        System.out.print("Enter Your Choice(1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance = balance + deposit();
            case 3 -> balance = balance - withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid Choice");        
            }
        }
            System.out.println("\n***************************");
            System.out.println("Thank You Have A Nice Day!!");
            System.out.println("***************************\n");


        
    }
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter The Amount To be Deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount Can't Be Negative");
            return 0;
        }
        else{
        return amount;
        }
    }
    static double withdraw(double balance){
        double remove;
        System.out.print("Enter The Amount To Be Withdraw: ");
        remove = scanner.nextDouble();
        if(remove > balance){
            System.out.println("Insufficient Funds");
            return 0;
        }

        else if (remove < 0) {
             System.out.println("Amount Can't Be Negative");
             return 0;
        }
        else{
            return remove;
        }

    }
}


