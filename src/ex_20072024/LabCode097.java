package ex_20072024;

public class LabCode097 {
    public static void main(String[] args) {


        // JDK > 13  new  update

        int itemcode  = 003;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");

        }
    }
}

/*
It is Electronic Gadget!
 */
/*
Multiple choice can be added to the same case
rage not allow
 */