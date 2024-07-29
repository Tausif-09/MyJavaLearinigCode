package ex_27072024;

public class LabCode145 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length ; i++) {
                System.out.println(args[i]);
            }

        }else{
            System.out.println("No Arguments given");
        }
    }
}
/* to test the main
No Arguments given
 */