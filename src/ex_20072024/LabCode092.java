package ex_20072024;
import java.util.Scanner;
public class LabCode092 {
    public static void main(String[] args) {

        // Switch case

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number so day get printed");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not Sure for the day !!! ");
        }

        System.out.println("#### out the switch loop");

    }
}

/*
Enter the day number so day get printed

5
Fri
#### out the switch loop
 */
