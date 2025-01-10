import java.util.Scanner;
public class devisibleBy5OrNot {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%5==0) System.out.println(x + " is divisible by 5");
        else System.out.println(x + " is not divisible by 5");
    }
}
