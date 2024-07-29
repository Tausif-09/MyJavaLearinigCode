package ex_27072024;

public class LabCode142 {
    public static void main(String[] args) {
        // final
        final int[] a = new int[4];
        a[3] = 123;

        System.out.println(a[3]);
        //   let change the value
        a[3] = 111;
        System.out.println(a[3]);

    }
}

/*
123
111
 */
