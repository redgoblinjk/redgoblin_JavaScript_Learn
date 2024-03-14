import java.util.Scanner;

public class Switch_Case {
    

    public static void main(String [] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the current time in P.S.T military time here: ");
        int timeValue = t.nextInt(); 
        String result = "";
        
        switch(timeValue) {
            case 1,2,3,4,5,6,7,8,9,10,11:
                result = "It is Morning";
                break;
            case 12,13,14,15,16:
                result = "It is Afternoon";
                break;
            case 17,18,19,20,21,22,23:
                result = "It is the Evening";
                break;
            case 24:
                result = "It is Midnight";
                break;   
        }

        System.out.printf("%s in the West Coast of America", result);
        

    }
}



