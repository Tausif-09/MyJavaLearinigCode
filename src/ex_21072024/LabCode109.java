package ex_21072024;

public class LabCode109 {
    public static void main(String[] args) {
        for(int i = 0; i > 1 ; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < 1 ; i++) {
            System.out.println("This is 2nd one so i value is"+i);
        }

        for(int i = 0; i <= 1 ; i++) {
            System.out.println("This is 3nd one so i value is"+i);
        }

    }
}


/*
here i condition is flase
so for loop will get br   .... no action
O/p

This is 2nd one so i value is0
This is 3nd one so i value is0
This is 3nd one so i value is1

 */
