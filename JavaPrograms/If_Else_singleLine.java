import java.util.Scanner;

public class If_Else_singleLine {

    public static void main(String [] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the current time in P.S.T military time here: ");
        int timeValue = t.nextInt(); 
        //System.out.print(timeValue);
        int bob = timeValue/12; 
        System.out.print(bob);
        String result = (bob >= 1) ? "It is Evening" : "It is morning";
        System.out.printf("%s in the West Coast of America", result);
        

    }
}

