package ex_27072024;

public class LabCode148 {
    public static void main(String[] args) {

        // two dimention array
        int[][] myarray = new int[3][3];
    /*  3 row and 3 colum
    |0| |0| |0|
    |0| |0| |0|
    |0| |0| |0|
    */
        myarray [0][0] = 34;
    /*  3 row and 3 colum
    |34| |0| |0|
    |0| |0| |0|
    |0| |0| |0|
    */
       myarray [0][1] = 56;
       myarray [0][2] = 66;
       myarray [1][0] = 33;
       myarray [1][1] = 22;

       /*  3 row and 3 colum
    |78| |56| |0|
    |0| |0| |0|
    |0| |0| |0|
    */
        System.out.println(myarray.length);  // out put is 3   .... not 9


        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
    }
}
/*
3

34 56 66
33 22 0
0 0 0 */