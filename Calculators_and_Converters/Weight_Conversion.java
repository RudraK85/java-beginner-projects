import java.util.Scanner;

public class Weight_Conversion {
    public static void main(String[] args) {
        double choose,lbs,kgs;

        System.out.println("----------WEIGHT CONVERSION PROGRAM----------");
        System.out.println("1.Convert lbs to kgs");
        System.out.println("2.Convert kgs to lbs");
        System.out.print("Choose the option:");

        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();

        if(choose == 1){
            System.out.print("Enter the weight in lbs:");
            lbs = scanner.nextDouble();
            if(lbs!=0){
                kgs=lbs*0.45359237;
                System.out.printf("The new weight in kgs is:%.2f",kgs);
            }
            else{
                System.out.println("You have entered invalid number ");
            }

        }
        else if(choose == 2){
            System.out.print("Enter the weight in kgs:");
            kgs = scanner.nextDouble();
            if(kgs!=0){
                lbs=kgs*2.20462262;
                System.out.printf("The new weight in kgs is:%.2f",lbs);
            }
            else{
                System.out.println("You have entered invalid number ");
            }
        
        }
        else{
            System.out.println("You have entered invalid number ");
        }
        scanner.close();
    }
    
}
