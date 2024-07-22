package ex_20072024;
import java.util.Scanner;

public class LabCode103 {
    public static void main(String[] args) {
        //    +   or   -

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        double num =  sc.nextInt();

        if (num > 0) {
            System.out.println("It is positive number");
        } else if (num<0) {
            System.out.println("It is negative number");
        }else {
            System.out.println("it is zero");
        }
    }
}
/*
Enter the number
-120
It is negative number

5000
It is positive number

Enter the number
0
it is zero

 */