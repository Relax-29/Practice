/*

// Ques : Take positive integer input and tell if it is divisible by 5 and 3.

import java.util.Scanner;
public class checkWhetherIntegerDivisibleBy5or3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%15==0) System.out.println(x + " is divisible by both 5 and 3");
        else System.out.println(x + " is not divisible by both 5 and 3");
    }
}


// Ques : Take positive integer input and tell if it is divisible by 5 but not divisible by 3.

import java.util.Scanner;
public class checkWhetherIntegerDivisibleBy5or3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%5==0 && (x%3)!=0) System.out.println(x + " is divisible by 5 but not 3");
        else if (x%15==0) System.out.println(x + " is divisible by both 5 and 3");
        else System.out.println(x + " is not divisible by both 5 ");
    }
}
                                                                                                              */

// Ques : Take positive integer input and tell if it is divisible by 5 or 3.

import java.util.Scanner;
public class checkWhetherIntegerDivisibleBy5or3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%5==0 || x%3==0) System.out.println(x + " is divisible by 5 or 3");
        else System.out.println(x + " is not divisible by either 5 or 3");
    }
}