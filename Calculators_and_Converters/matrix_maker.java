import java.util.Scanner;

public class matrix_maker {
    public static void main(String[] args) {
      
        System.out.println("......MATRIX MAKER......");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number of Rows :");
        int rows = scanner.nextInt(); 

        System.out.print("Enter The Number of Columns :");
        int columns = scanner.nextInt();

        System.out.print("Enter the Symbol to Use :");
        String symbol = scanner.next();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

