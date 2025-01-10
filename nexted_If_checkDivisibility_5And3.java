import java.util.Scanner;
public class nexted_If_checkDivisibility_5And3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.print("Enter the number: ");
        x = S.nextInt();
        if (x%5==0){
            if(x%3==0) System.out.println(x + " is divisible by both 5 and 3");
            else System.out.println(x + " is divisible by 5 but not divisible by 3");
        }
        else if (x%3==0) {
            System.out.println(x + " is divisible by 3 but not divisible by 5");
        }
        else System.out.println(x + " is neither divisible by 5 nor divisible by 3");
    }
}
