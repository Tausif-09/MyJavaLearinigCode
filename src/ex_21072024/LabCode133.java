package ex_21072024;

public class LabCode133 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50 ; i++) {

            if (i%3 == 0 && i%5 == 0) {
                System.out.println("This is FizzBuzz "+i);
            } else if (i%3 ==0) {
                System.out.println("Fizz "+i);
            } else if (i%5 ==0) {
                System.out.println("Buzz "+i);
            } else {
                System.out.println(i);
            }


        }

    }
}
/*
1
2
Fizz 3
4
Buzz 5
Fizz 6
7
8
Fizz 9
Buzz 10
11
Fizz 12
13
14
This is FizzBuzz 15
16
17
Fizz 18
19
Buzz 20
Fizz 21
22
23
Fizz 24
Buzz 25
26
Fizz 27
28
29
This is FizzBuzz 30
31
32
Fizz 33
34
Buzz 35
Fizz 36
37
38
Fizz 39
Buzz 40
41
Fizz 42
43
44
This is FizzBuzz 45
46
47
Fizz 48
49
Buzz 50
 */
