package ex_21072024;

public class LabCode123 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50 ; i++) {

            if (i%2 == 0) {
                System.out.println("** Even no is -> "+i);
                continue;
            }
            System.out.println("Odd no is ->"+i);
        }
    }
}
