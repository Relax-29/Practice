import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%2==0) System.out.println(x + " is an even number.");
        else System.out.println(x + " is an odd number");
    }
}
