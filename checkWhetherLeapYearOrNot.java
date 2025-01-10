import java.util.Scanner;
public class checkWhetherLeapYearOrNot {
        public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
            int x;
            System.out.print("Enter the year: ");
            x = S.nextInt();
            if (x%4==0) System.out.println(x + " is a leap year");
            else System.out.println(x + " is not a leap year");
        }

}
