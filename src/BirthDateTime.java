import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day = 0;
        int hour;
        int minute;

        year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
            day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31);
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 29);
                break;
        }
           hour = SafeInput.getRangedInt(in,"Enter the hour you were born", 1, 24);
           minute = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);

           System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);
    }

}
