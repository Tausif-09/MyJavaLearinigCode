package ex_20072024;
import java.util.Scanner;
public class LabCode094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphbate");

        char input_char  = sc.next().charAt(0);

        switch (input_char){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            default:
                System.out.println("It it Consonant!!! ");
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>");

        switch (input_char){
            case 'a','i','o','u','e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("It it Consonant!!! ");
        }

    }
}

/*
Enter the alphbate
u
vowel
>>>>>>>>>>>>>>>>>>>>>
Vowel
*/