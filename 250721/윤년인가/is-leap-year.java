// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intY = sc.nextInt();

        // 변수 정의
        String strResult;
        // 조건문
        if (intY % 4 == 0) {
            if (intY % 100 == 0 && intY % 400 != 0) {
                strResult = "false";
            } else {
                strResult = "true";
            }
        } else {
            strResult = "false";
        }

        // 출력
        System.out.println(strResult);
    }
}