package ex_27072024;

public class LabCodeHM140 {
    public static void main(String[] args) {
        // Second highest salary without using build function

        int [] list_sal = {10, 11, 9, 8, 21, 6};
        int [] sort_sal = new int[5];

        for (int i = 0; i < list_sal.length-1; i++) {

            for (int j = 0; j < list_sal.length - i - 1 ; j++) {
                if (list_sal[j] > list_sal[j+1]) {
                    // if true swap
                    int temp = list_sal[j];
                    list_sal[j] = list_sal[j+1];
                     list_sal [j+1] = temp;
                }
            }

        }

        for (int i = 0; i < list_sal.length; i++) {
            System.out.println(list_sal[i]);
        }

        System.out.println("Second high salary will be.... "+list_sal[list_sal.length-2]);

    }
}
/*
6
8
9
10
11
21
Second high salary will be.... 11

 */