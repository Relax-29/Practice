//HW : If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three.


import java.util.Scanner;
public class ageYoungest {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the Age of Ram: ");
        x = S.nextInt();
        int y;
        System.out.print("Enter the Age of Shyam: ");
        y = S.nextInt();
        int z;
        System.out.print("Enter the Age of Ajay: ");
        z = S.nextInt();

        if (x<y && x<z) System.out.println("Ram is Youngest");
        else if (y<x && y<z) System.out.println("Shyam is Youngest");
        else if (z<y && z<x) System.out.println("Ajay is Youngest");
        else if ((x==y || y==z || z==x) && (x<y || y<x || y<z || y>z || x<z || z<x)) System.out.println("Both are of same age");
        else System.out.println("They all are of same age");
    }
}
