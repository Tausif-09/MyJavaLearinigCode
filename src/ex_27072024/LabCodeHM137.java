package ex_27072024;
import java.util.Scanner;
public class LabCodeHM137 {
    public static void main(String[] args) {

        // code for right angle triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("");
                System.out.print("*");
            }
            System.out.println();

//
        }
    }
}

/*
Enter the number
5
*
**
***
****
*****
 */