import java.util.Scanner;


public class factorial {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number:");
        int numValue = reader.nextInt();
        int result = 1;

        for(int t = 1; t <= numValue; t++){
            result = result * t;
        }
        System.out.printf("Factorial = %d", result);

        reader.close();



    }
}

