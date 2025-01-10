//Ques : Take 3 numbers input and tell if they can be the sides of a triangle.

import  java.util.Scanner;
public class triangleCheck {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the 1st sides: ");
        x = S.nextInt();
        int y;
        System.out.print("Enter the 2nd sides: ");
        y = S.nextInt();
        int z;
        System.out.print("Enter the 3rd sides: ");
        z = S.nextInt();

        if ((x+y)>z && (y+z)>x && (x+z)>y) System.out.println(x + ", " + y + " and " + z + " can be the sides of triangle ");
        else System.out.println(x + ", " + y + " and " + z + " can not be the sides of triangle ");

    }
}
