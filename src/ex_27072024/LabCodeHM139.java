package ex_27072024;

public class LabCodeHM139 {

    public static void main(String[] args) {
        // array highest salary
        int[] salary_list = {10, 25, 35, 8, 9, 15, 45};
        int max_salary = 0;
        for (int i = 0; i < salary_list.length; i++) {

            if (max_salary < salary_list[i]) {
                max_salary = salary_list[i];
            }

        }
        System.out.println("Max Salary from the given is "+max_salary);
    }
}

/*
Max Salary from the given is 45
 */