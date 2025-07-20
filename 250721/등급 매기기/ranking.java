// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 조건문
        if (intN >= 90) {
            System.out.println("A");
        } else if (intN >= 80) {
            System.out.println("B");
        } else if (intN >= 70) {
            System.out.println("C");
        } else if (intN >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}