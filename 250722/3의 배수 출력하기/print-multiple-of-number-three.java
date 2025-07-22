// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 변수 정의
        int intCount = 1;
        // 출력
        while (intCount < intN + 1) {
            if (intCount % 3 == 0) {
                System.out.print(intCount + " ");
            }
            intCount += 1;
        }
    }
}