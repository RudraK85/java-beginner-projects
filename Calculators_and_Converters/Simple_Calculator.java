import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        System.out.println("---------SIMPLE CALCULATOR---------");


        double first,second;
        double result = 0;
        boolean validOperator = true;
        char operator;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER:");
        first = scanner.nextDouble();

        System.out.print("ENTER AN OPERATOR ( +, -, *, /, ^):");
        operator = scanner.next().charAt(0);

        System.out.print("ENTER THE SECOND NUMBER:");
        second = scanner.nextDouble();
        
        switch (operator) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
            case '/' -> {
                if(second == 0){
                    System.out.println("CANNOT DIVIDE BY ZERO!");
                    validOperator = false;
                }
                else{
                    result = first / second;
                }

            }

            case '^' -> result = Math.pow(first,second);
            default -> {
                System.out.println("INVALID OPERATOR!");
                validOperator = false;
            }    
        }
        if(validOperator){
            System.out.println(result);
        }
        scanner.close();
    }
}
