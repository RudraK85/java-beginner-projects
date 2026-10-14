import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {

            //PYTHAGORAS THEOREM FORMULA  c = √(a² + b²)

        double c;

        System.out.print("ENTER THE LENGTH OF SIDE A :");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        
        System.out.print("ENTER THE LENGTH OF SIDE B :");
        Scanner scanner1 = new Scanner(System.in);
        double b = scanner1.nextDouble();
        
        a = Math.pow(a,2); 
        b = Math.pow(b,2);
        c= a+b;
        double result = Math.sqrt(c);
        System.out.printf("THE VALUE OF HYPOTENUS SIDE C %.2fcm", result);

        scanner.close();
        scanner1.close();
    }
}
class FORMULA1 {
    public static void main(String[] args) {

            //AREA OF CIRCLE FORMULA (A=πr2)

            double r,result;
            System.out.print("ENTER THE VALUE OF R (RADIUS) :");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextDouble();

            result = Math.PI*r*r;
            System.out.printf("THE AREA OF CIRCLE :%.2fcm²", result);
        scanner.close();
    }
}
