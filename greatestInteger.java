//Ques : Take 3 positive integers input and print the greatest of them.
/*
import java.util.Scanner;
public class greatestInteger {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the 1st number: ");
        x = S.nextInt();
        int y;
        System.out.print("Enter the 2nd number: ");
        y = S.nextInt();
        int z;
        System.out.print("Enter the 3rd number: ");
        z = S.nextInt();

        if (x>y && x>z) System.out.println(x + " is the greatest integers");
        else if (y>x && y>z) System.out.println(y + " is the greatest integers");
        else if (z>y && z>x) System.out.println(z + " is the greatest integers");
        else System.out.println("both are same");

    }
}                                                                                                   */


                        //By Nexted-if Method
import java.util.Scanner;
public class greatestInteger {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the 1st number: ");
        x = S.nextInt();
        int y;
        System.out.print("Enter the 2nd number: ");
        y = S.nextInt();
        int z;
        System.out.print("Enter the 3rd number: ");
        z = S.nextInt();

        if (x > y) {
            if (x==z) System.out.println(x + " is greater than " + y + " and also " + x + " is equal to " + z);
            else if (x>z) System.out.println(x + " is the greatest integer");
            return;
        }
        if (z > y) {
            if (z==x) System.out.println(z + " is greater than " + y + " and also " + z + " is equal to " + x);
            else if (x<z) System.out.println(z + " is the greatest integer");
            return;
        }
        if (x < y) {
            if (z<y) System.out.println(y + " is the greatest integer");
            else if (y==z) System.out.println(y + " is greater than " + x + " and also " + y + " is equal to " + z);
            return;
        }
        else System.out.println(x + " = " + y + " = " + z);

    }
}

