// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 조건문
        if (intA >= intB) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (intA > intB) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (intB >= intA) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (intB > intA) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (intA == intB) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (intB != intA) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}