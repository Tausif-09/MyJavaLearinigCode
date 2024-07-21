package ex_21072024;

public class LabCode122 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            if (i == 5) {
                //continue;
                break;
            }
            System.out.println("Alert");
        }
    }
}
/*

when i == 5   Alert not get printed; --->  continue   and i run from 0 to 9
but break      for loop break and at last 5 only

0
Alert
1
Alert
2
Alert
3
Alert
4
Alert
5
6
Alert
7
Alert
8
Alert
9
Alert
 */