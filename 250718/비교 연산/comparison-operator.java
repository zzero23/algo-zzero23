// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // [조건 1] A가 B보다 같거나 큰가?
        if (num1 >= num2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        // [조건 2] A가 B보다 큰가?
        if (num1 > num2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        // [조건 3] B가 A보다 같거나 큰가?
        if (num2 >= num1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        // [조건 4] B보다 A가 큰가?
        if (num2 > num1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        // [조건 5] A와 B는 같은가?
        if (num1 == num2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        // [조건 6] A와 B는 다른가?
        if (num1 != num2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}