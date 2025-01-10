import  java.util.Scanner;
public class areaVSparameter {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int L;
        System.out.print("Enter the Length of the Rectangle: ");
        L = S.nextInt();
        int B;
        System.out.print("Enter the Bredth of the Rectangle: ");
        B = S.nextInt();
        int A = L*B;
        int P = 2*(L+B);
        if (A>P) System.out.println("Area is greater than Parameter");
        else if (A==P) System.out.println("Area is equal to Parameter");
        else System.out.println("Area is lesser than Parameter");
    }
}
