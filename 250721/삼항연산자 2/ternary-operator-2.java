// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        String strResult = intA == 1 ? "t" : "f";

        // 출력
        System.out.println(strResult);
    }
}