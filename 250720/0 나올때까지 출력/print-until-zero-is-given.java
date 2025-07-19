// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수 정의
        int int1 = -1;
        Scanner sc = new Scanner(System.in);

        // 조건 및 반복문
        while (int1 != 0) {
            // 입력
            int1 = sc.nextInt();

            if (int1 == 0) {
                break;
            } else {
                System.out.println(int1);
            }
        }
    }
}