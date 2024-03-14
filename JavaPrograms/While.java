import java.util.Scanner;

public class While {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numValue = reader.nextInt();
        int result = 0;
        while(numValue >= 1) {
            result = result + numValue;
            --numValue;
        }

        System.out.printf("The sum is %d.", result);

        reader.close();


    }
}
