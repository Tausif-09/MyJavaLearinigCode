package ex_20072024;
import java.util.Scanner;

public class LabCode101 {
    public static void main(String[] args) {

        // get detail at the run time ..  a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name...");
        String name = sc.next();

        System.out.println("Enter your age...");
        int age = sc.nextInt();

        System.out.println("Enter your Salary...");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);


        sc.close();


    }
}

/*
Enter your name...
Tausif
Enter your age...
32
Enter your Salary...
25000
Your details are Tausif
Your age is 32
Your Salary is 25000.0
 */