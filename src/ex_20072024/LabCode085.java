package ex_20072024;

public class LabCode085 {
    public static void main(String[] args) {
        boolean a= true;
        a= !a; // debug the point show value
        if(2+2 <4){  // 4<4  is False so it pass the loop
            System.out.println("inside the loop....");
        }else {
            System.out.println("Outside the loop.... \n"+a);
        }
    }
}
/*
Outside the loop....
false
 */