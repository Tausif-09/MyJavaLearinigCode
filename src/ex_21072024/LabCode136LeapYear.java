package ex_21072024;

import java.util.Scanner;

public class LabCode136LeapYear {
    public static void main(String[] args) {
        // take input from user yr
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt(); // pass sc to year

        // temp
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
/*
Enter a year: 2030
2030 is not a leap year.

Enter a year: 2020
2020 is a leap year.
 */