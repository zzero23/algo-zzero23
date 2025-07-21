// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        double dblA = sc.nextDouble();
        double dblB = sc.nextDouble();

        // 조건문
        if (dblA >= 1.0 && dblB >= 1.0) {
            System.out.println("High");
        } else if (dblA >= 0.5 && dblB >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}