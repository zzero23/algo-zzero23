// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 조건문
        if (intN >= 3000) {
            System.out.println("book");
        } else if (intN >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}