import java.util.Scanner;
public class AbsoluteValue {
        public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
            int x;
            System.out.print("Enter the number: ");
            x = S.nextInt();
            if (x<0) System.out.println(-x);
            else System.out.println(x);
        }
}


