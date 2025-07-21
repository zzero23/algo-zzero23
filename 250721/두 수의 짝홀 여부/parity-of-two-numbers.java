// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 조건문
        if (intA % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (intB % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}