import java.util.Scanner;

public class DayOfWeek {
    private static int day;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a date in (dd-mm-yyyy) format");
        System.out.print("Enter a date (dd): ");
        int date = s.nextInt();
        System.out.print("Enter a month (mm): ");
        int month = s.nextInt();
        System.out.print("Enter a year (yyyy): ");
        int year = s.nextInt();

        int temp = year;

        // while loop to calculate the length of year
        // year should be in 4 digits
        int count = 0;      // it store the length of year
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        if (date > 31) {
            System.out.println("Date cannot be more than 31.");
        } else if (month > 12) {
            System.out.println("Month cannot be more than 12.");
        } else if ( count != 4 ) {
            System.out.println("Enter proper year.");
        } else {
            day = dayOfWeek(date, month, year);
        }

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }

    // d for date, m for month, y for year
    private static int dayOfWeek(int d, int m, int y) {
        int y0 = 0, x = 0, m0 = 0, d0 = 0;
        y0 = y - (14-m)/12;
        x  = y0 + y0/4 - y0/100 + y0/400;
        // m0 stores the month: "January" as 11, "February" as 12 and "March" as 1, "April" as 2, ... , "December" as 10.
        m0 = m + 12*((14-m)/12) - 2;
        d0 = (d+x+31*m0/12) % 7;        // stores the day: "Sunday" as 0, "Monday" as 1, ... and so on

        return d0;

    }
}
