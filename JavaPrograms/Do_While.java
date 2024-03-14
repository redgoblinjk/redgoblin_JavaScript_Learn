import java.util.Scanner;

public class Do_While {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numValue = reader.nextInt();
        int result = 0;
        do {
            result = result + numValue;
            --numValue;
            

        } while(numValue >= 0);

        System.out.printf("The sum is %d.", result);

        reader.close();


    }
}
