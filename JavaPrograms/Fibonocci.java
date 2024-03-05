import java.util.Scanner;

public class Fibonocci {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number of values: ");

        int numValue = reader.nextInt(); 
        int numb1 = 0, numb2 = 1, temp = 0;

        System.out.printf("Series: %d, %d", numb1 , numb2);

        for(int t = 2; t < numValue; t++ ) {
            temp = numb2;
            numb2 = numb1 + numb2;
            numb1 = temp;
            System.out.printf(", %d", numb2);

        }
        



        reader.close();
    }
}