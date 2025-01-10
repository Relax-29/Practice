// Ques : Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.

import java.util.Scanner;
public class Nexted_If_checkDivisibility {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%5==0){
            if(x%15!=0) System.out.println(x + " is divisible by 5 or but not divisible by 3 and 15");
            else System.out.println(x + " is divisible by 3, 5, 15 ");
            return;
        }
        if (x%3==0){
            if(x%15!=0) System.out.println(x + " is divisible by 3 but not divisible by 5 and 15");
            else System.out.println(x + " is divisible by 3, 5, 15 ");
            return;
        }

        else System.out.println(x + " is neither divisible by 5 and 3 nor divisible by 15");
    }
}
