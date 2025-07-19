// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int intN = sc.nextInt();
            if (intN < 25) {
                System.out.println("Higher");
            } else if (intN > 25) {
                System.out.println("Lower");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}