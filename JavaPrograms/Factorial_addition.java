import java.util.Scanner;

public class Factorial_addition {
    public static void main(String [] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numValue = reader.nextInt(); 
        int numb1, fibo = 1, result = 0;

        for(int x = 1; (numValue/x)%10 > 0; x = x*10) {

            numb1 = (numValue/x)%10;
            //System.out.println(numb1);

            fibo = 1;
            for(int t = 1; t <= numb1; t++){
                fibo = fibo * t;
            }
            System.out.printf("Digit=%d, Fibo=%d\n", numb1, fibo );
            result = result + fibo;
    
        }
         System.out.printf("%d\n", result);

         boolean numStat;

         if(result == numValue) {
            numStat = true;
            System.out.printf("%b", numStat);
         } else {
            numStat = false;
            System.out.printf("%b", numStat);  
         }
        
         

        reader.close();
    }
} 