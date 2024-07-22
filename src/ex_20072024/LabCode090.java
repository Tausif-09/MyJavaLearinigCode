package ex_20072024;
import java.util.Scanner;
public class LabCode090 {
// grade

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");

        int Marks = sc.nextInt();

        if (Marks >=90 && Marks <=100) {
            System.out.println("A");
        } else if (Marks >=80 && Marks <=90) {
            System.out.println("B");
        } else if (Marks >=70 && Marks <=80) {
            System.out.println("C");
        }else if (Marks >=60 && Marks <=70)
        { System.out.println("D");
        }else{
            System.out.println("Pass Class Above 60");
        }


    }
}

/*
Enter the Score
75
C
 */