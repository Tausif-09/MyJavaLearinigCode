package ex_27072024;
import java.util.Scanner;
public class LabCode139 {
    public static void main(String[] args) {

        // New
        int[] marks = new int[3];    // 0    1   2
        // len    3
        // lets check the default vales

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        // assigned at the run time   scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for zero index");
        marks[0] = sc.nextInt();
        marks[1] = 99;
        marks[2] = 100;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        String[] Week_days = {"Mon", "Sat", "Fri", "Sun"};

        for (int i = 0; i < Week_days.length; i++) {
            System.out.println(Week_days[i]);
        }


    }
}

/*
0
0
0
Enter the value for zero index
88
88
99
100
Mon
Sat
Fri
Sun
 */
