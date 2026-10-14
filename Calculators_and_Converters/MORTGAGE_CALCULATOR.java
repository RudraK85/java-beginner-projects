import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
@SuppressWarnings("resource")
public class MORTGAGE_CALCULATOR{
    public static void main(String[] args) {

        System.out.println("******** MORTGAGE CALCULATOR *********");

        final byte Months = 12;
        int principal=0;
        double r=0;
        int numberOfPayments=0;

        while(true){
        System.out.print("Principal:");
        Scanner scanner = new Scanner(System.in);
        principal = scanner.nextInt();
        if(principal>=1000 && principal<=1_000_000)
            break;
        System.out.println("ENTER A VALID VALUE BETWEEN 1000 AND 1_000_000");
        }

        while (true) {
        System.out.print("Annual Interest Rate:");
        Scanner annual = new Scanner(System.in);
        double rate = annual.nextDouble();
        r=rate/100/Months;
        if(r>0)
            break;
        System.out.println("ENTER A VALID VALUE");
        }

        while (true) {
        System.out.print("Period (Years):");
        Scanner period = new Scanner(System.in);
        byte years = period.nextByte();
        numberOfPayments = years * Months;
        if(numberOfPayments>0)
            break;
        System.out.println("ENTER A VALID VALUE");
        }

        double result = principal * (r * Math.pow(1 + r, numberOfPayments))/(Math.pow(1 + r,numberOfPayments)-1);
        System.out.println("Mortgage:" + NumberFormat.getCurrencyInstance(Locale.US).format(result));
        
        
    }
    
}