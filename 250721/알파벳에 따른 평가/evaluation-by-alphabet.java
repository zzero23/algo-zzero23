// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        char char1 = sc.next().charAt(0);

        // 조건문
        if (char1 == 'S') {
            System.out.println("Superior");
        } else if (char1 == 'A') {
            System.out.println("Excellent");
        } else if (char1 == 'B') {
            System.out.println("Good");
        } else if (char1 == 'C') {
            System.out.println("Usually");
        } else if (char1 == 'D') {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}