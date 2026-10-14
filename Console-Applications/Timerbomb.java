import java.util.Scanner;

public class Timerbomb {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("__________TIMER BOMB__________");
        Scanner scanner = new Scanner(System.in);
        System.out.print("START THE TIMER:");
        String timer = scanner.nextLine().toLowerCase();
/*
--------------------------------------------------------------------------
        can do this with if condition 
        but only problem in if condition is it does not go in infinte loop
--------------------------------------------------------------------------
        if(timer.equals("yes")){
        int start = 10;
        for(int i = start ; i>0 ; i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR !!");
        }
        else{
            System.out.println("You Have Missed the Opportunity!!");
        }
*/
          
        while(!timer.equals("yes") ){
             System.out.println("You Have Missed the Opportunity!!");
             System.out.println("TRY AGAIN..");
             System.out.print("START THE TIMER:");
             timer = scanner.nextLine().toLowerCase();
        }
        int start = 10;
        for(int i = start ; i>0 ; i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR !!");
        scanner.close();
    }
}

