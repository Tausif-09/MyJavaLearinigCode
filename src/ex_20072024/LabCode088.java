package ex_20072024;
import java.util.Scanner;
public class LabCode088 {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 .. ");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2 .. ");
        int num2 = sc.nextInt();

         // System.out.println(Math.max(num1, num2));

        if (num1 > num2) {
            System.out.println(num1);
        }else if (num1 < num2){
            System.out.println(num2);
        }else {
            System.out.println("same");
        }


    }
}
/*
Enter the number 1 ..
-25
Enter the number 2 ..
-3
-3

// for float its through error :)
 */