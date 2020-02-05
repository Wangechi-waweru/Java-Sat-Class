package com.company;

public class Operators {
    public static void main(String[] args) {
//     Operatos:
//        1.Arithmetic ops
//        2.Assignment ops
//        3.Comparison ops
//        4.Logical ops

        int x = 12;
        int y = 3;
        int sum = x + y;
        System.out.println(sum);
        int modulus = x % y;
        System.out.println(modulus);

//        Increment ops: ++:increments a value in a variable
        x++;//12 + 1
        System.out.println(x);

        --y;
        System.out.println(y);

//        2.Assignment ops: =
        int i = 5;
        i = i + 3;
        i+=3;
        System.out.println(i);


//        Comparison ops:returns a boolean data typr
//        1. == equals
//        2. != not equal
//        3. > greater than
//        4. < less than
//        5. >= greater than or equal to
//        6. <= less than or equal to
        System.out.println(5 > 10);
        System.out.println(5 < 10);

//        logical ops:used to determine the logic btween two variables or values
//         used to work with conditional statement
//        1.&& logical AND: return true, if both condtions are true
//        2.|| logical OR :returns true if only one condition is true
//        3.!  logical NOT:reverses a condtions

        int a = 4;
        int b = 54;
        int c = 23;

        System.out.println(a < b && b > c);
        System.out.println(a < b && b == c);
        System.out.println(!(a < b && b == c));






    }
}
