public class Array_Exception {
    public static void main(String [] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        try {    
            int i;
            for (i=0; i<=10; i++ ) {
                System.out.printf("%d\n", myArray[i]);
             }
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.printf("%s",exception);
        }

    }
}
