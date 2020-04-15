/*
Pseudocode
import Scanner
declare Convert Date class
declare main method
declare variables
split string by "/"
Integer.parseInt()
initialize variables for month, day, year
define switch cases
check input for valid ranges
define variables for month, day, year
concat values
print
 */


import java.util.Scanner;

public class ConvertDateFormat {
    public static void main(String[] args) {
        String[] dateStr;
        String monthStr;
        int monthInt;
        int dayInt;
        int daysInMonth;
        int yearInt;
        Scanner input;

        System.out.println("Enter a date in the following format (mm/dd/yyyy): ");
        input = new Scanner(System.in);
        dateStr = input.next().split("/");
        monthInt = Integer.parseInt(dateStr[0]);

        if (monthInt < 1 || monthInt > 12 ) {
            System.out.println("A valid month (mm) is between 1 and 12.");
            System.out.println("Example date format (mm/dd/yyyy): 02/28/2020 for February 28, 2020.");
            System.exit(1);
        }

        switch (monthInt) {
            case 1:
                monthStr = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthStr = "February";
                daysInMonth = 28;
                break;
            case 3:
                monthStr = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthStr = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthStr = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthStr = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthStr = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthStr = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthStr = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthStr = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthStr = "November";
                daysInMonth = 30;
                break;
            default:
                monthStr = "December";
                daysInMonth = 31;
                break;
        }
        dayInt = Integer.parseInt(dateStr[1]);
        if (dayInt < 1 || dayInt > daysInMonth ) {
            System.out.println("A valid day (dd) for " + monthStr + " is between 1 and " + daysInMonth + ".");
            System.out.println("Example date format (mm/dd/yyyy): 02/28/2020 for February 28, 2020.");
            System.exit(1);
        }
        yearInt = Integer.parseInt(dateStr[2]);
        if (yearInt < 0 || yearInt > 9999) {
            System.out.println("A valid year (yyyy) is between 0 and 9999.");
            System.out.println("Example date format (mm/dd/yyyy): 02/28/2020 for February 28, 2020.");
            System.exit(1);
        }
        System.out.printf("It is %s %d, %d", monthStr, dayInt, yearInt);

    }
}
