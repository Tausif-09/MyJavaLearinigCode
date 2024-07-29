package ex_27072024;

public class LabCode143 {
    public static void main(String[] args) {
        final float pi = 3.14F;
    int[] myarray = new int[5];
    myarray[2] = 5665;

    System.out.println("index "+"array_value "+"Memory_address");
    for (int i = 0; i <myarray.length ; i++) {
           // System.out.println(myarray[i]);

            System.out.println(i+" "+myarray[i]+"->"+"-- "+System.identityHashCode(myarray[i]));
        }



    }
}

/*
index array_value Memory_address
0 0->-- 2065951873
1 0->-- 2065951873
2 5665->-- 159413332
3 0->-- 2065951873
4 0->-- 2065951873
 */
