// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intScore = sc.nextInt();

        // 반복 및 조건문
        for (int i = intScore; i < 101; i++) {
            if (i >= 90) {
                System.out.print("A ");
            } else if (i >= 80) {
                System.out.print("B ");
            } else if (i >= 70) {
                System.out.print("C ");
            } else if (i >= 60) {
                System.out.print("D ");
            } else {
                System.out.print("F ");
            }
        }
    }
}