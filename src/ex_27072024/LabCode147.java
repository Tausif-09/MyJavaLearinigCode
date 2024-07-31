package ex_27072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LabCode147 {
    public static void main(String[] args) {

        int[] salaries = {3,4,5,11,2,34,21,9,34,5,2};

        int max = salaries[0];
        int min = salaries[0];

        for (int i = 0; i <salaries.length ; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
            if (salaries[i]< min)
            {
                min = salaries[i];
            }
        }

        System.out.println("Max salaries will be... "+max);
        System.out.println("Min salaries will be .... "+min);

        System.out.println("-------------------");
    // Sort
        Arrays.sort(salaries);
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }
        System.out.println("2nd ... " +salaries[salaries.length -1]);

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[salaries.length-i] == salaries[salaries.length]) {
                continue;
            }else {
                System.out.println("2nd...."+salaries[salaries.length-i]);
            }
        }
    }
}
/*
Max salaries will be... 34
Min salaries will be .... 2
 */