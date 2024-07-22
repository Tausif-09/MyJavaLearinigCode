package ex_20072024;
import java.util.Scanner;
public class LabCode087 {
    public static void main(String[] args) {
        // logic building
        // input - user and output will be odd even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");

        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}

/*
100
Even

25
Odd
 */