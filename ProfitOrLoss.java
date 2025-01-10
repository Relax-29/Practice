import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int cp;
        System.out.print("Enter the Cost price: ");
        cp = S.nextInt();
        int sp;
        System.out.print("Enter the Selling price: ");
        sp = S.nextInt();
        if (cp<sp) System.out.println("Profit");
        else if (cp>sp) System.out.println("Loss");
        else System.out.println("Neither Profit nor Loss");
    }
}
