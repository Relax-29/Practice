import java.util.Scanner;
public class checkWhetherIntigerThreeDigitNumOrNot {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = S.nextInt();
        if(n>=100 && n<=999) System.out.println("It is a three digit number");
        else System.out.println("It is not three digit number");
    }
}
