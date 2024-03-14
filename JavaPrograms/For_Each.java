public class For_Each {
    public static void main(String args[]) {
        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : days ) {

            if (day == "Monday" || day == "Tuesday" || day == "Wednesday" ||day == "Thursday" || day == "Friday") {
                System.out.printf("%s is a weekday\n", day);
            } else {
                System.out.printf("%s is a weekend\n", day);
            }

        }


   


        

    }
}
