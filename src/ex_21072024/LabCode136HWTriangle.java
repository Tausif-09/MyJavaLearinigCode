package ex_21072024;
import java.util.Scanner;
public class LabCode136HWTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // to take input from used at run time



        // Input side lengths from the user

        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        // nextDouble is to take same as int what Proamod Sir thought for data type match
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // now main logic
        // Determine the type of triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}

/* // two side same
Enter the length of side 1: 25
Enter the length of side 2: 36
Enter the length of side 3: 36
The triangle is isosceles.

// no side same
Enter the length of side 1: 10
Enter the length of side 2: 15
Enter the length of side 3: 36
The triangle is scalene.

// All side same 
Enter the length of side 1: 36
Enter the length of side 2: 36
Enter the length of side 3: 36
The triangle is equilateral.
 */
