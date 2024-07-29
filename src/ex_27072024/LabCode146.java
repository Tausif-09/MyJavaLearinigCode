package ex_27072024;

import java.util.Scanner;

public class LabCode146 {
    public static void main(String[] args) {
        // input from user

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for the subject" + (i+1)); // () for subject number subject1. subject2
            marks[i] = sc.nextInt();
        }
        // print with sub
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject "+(i+1)+"  "+marks[i]);
        }

        float total_marks = 0;
        for (int i = 0; i < marks.length; i++) {
            total_marks = total_marks + marks[i];
        }
        System.out.println(total_marks);
        System.out.println("Avarage will be " + total_marks/marks.length+ " %");
    }
}
/*
Enter the marks for the subject1
56
Enter the marks for the subject2
56
Enter the marks for the subject3
56
Enter the marks for the subject4
56
Enter the marks for the subject5
56
Subject 1  56.0
Subject 2  56.0
Subject 3  56.0
Subject 4  56.0
Subject 5  56.0
280.0
Avarage will be 56.0 %
 */