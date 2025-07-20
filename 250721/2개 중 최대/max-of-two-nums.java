// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 조건문
        int intResult = intA > intB ? intA : intB;

        // 출력
        System.out.println(intResult);
    }
}