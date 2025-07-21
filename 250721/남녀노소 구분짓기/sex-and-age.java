// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intSex = sc.nextInt();
        sc.nextLine();
        int intAge = sc.nextInt();

        // 변수 정의
        String strResult;

        // 조건문
        if (intSex == 0) {
            if (intAge >= 19) {
                strResult = "MAN";
            } else {
                strResult = "BOY";
            }
        } else {
            if (intAge >= 19) {
                strResult = "WOMAN";
            } else {
                strResult = "GIRL";
            }
        }

        // 출력
        System.out.println(strResult);
    }
}