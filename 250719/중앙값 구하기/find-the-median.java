// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        // 변수 정의
        int midNum;

        // 조건문
        if (numA > numB) {
            if (numB > numC) {
                midNum = numB;
            } else if (numA > numC) {
                midNum = numC;
            } else {
                midNum = numA;
            }
        } else {
            if (numA > numC) {
                midNum = numA;
            } else if (numB > numC) {
                midNum = numC;
            } else {
                midNum = numB;
            }
        }

        // 출력
        System.out.println(midNum);
    }
}