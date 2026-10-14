import java.util.Scanner;

public class Temperature_Calculator {
    public static void main(String[] args) {

        System.out.println("........TEMPERTAURE CONVERTER........");


        double temp;
        double celsius;
        String unit;

        System.out.print("Enter the temperature:");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextDouble();
        double temp_to_celsius = (temp-32)*0.5555555555555556;
        double temp_to_fahrenheit = (temp*1.8)+32;


        System.out.print("Convert to Celsius or Fahrenheit? (C or F):");
        unit = scanner.next().toUpperCase();
        celsius = (unit.equals("C")) ? temp_to_celsius : temp_to_fahrenheit; 
        System.out.printf("%.1f°%s",celsius,unit);

        scanner.close();
    }
}
