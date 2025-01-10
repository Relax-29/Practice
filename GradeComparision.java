import java.util.Scanner;
public class GradeComparision {
    public static void main(String[] args) {

            Scanner S = new Scanner(System.in);
            System.out.print("Mathematics: ");
            double M;
            M = S.nextInt();
            System.out.print("Physics: ");
            double P;
            P = S.nextInt();
            System.out.print("Chemistry: ");
            double C;
            C = S.nextInt();
            System.out.print("English: ");
            double E;
            E = S.nextInt();
            System.out.print("Hindi: ");
            double H;
            H = S.nextInt();

            double PP = (M + P + C + H + E)/5;
            System.out.println("Percentage: " + PP + "%");

            if (PP<=100 && PP>=90) System.out.println("Performance: Excellent");
            else if (PP<90 && PP>=80) System.out.println("Performance: Very Good");
            else if (PP<80 && PP>=70) System.out.println("Performance: Good");
            else if (PP<70 && PP>=60) System.out.println("Performance: Can do batter");
            else if (PP<60 && PP>=50) System.out.println("Performance: Average");
            else if (PP<50 && PP>=40) System.out.println("Performance: Below Average");
            else if (PP>100 || PP< 0) System.out.println("Invalid marks enter");
            else System.out.println("Performance: Fail");

        }
}
