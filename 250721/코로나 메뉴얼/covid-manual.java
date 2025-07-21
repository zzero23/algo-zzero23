// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        char charStatus1 = sc.next().charAt(0);
        int intTemp1 = sc.nextInt();
        sc.nextLine();
        char charStatus2 = sc.next().charAt(0);
        int intTemp2 = sc.nextInt();
        sc.nextLine();
        char charStatus3 = sc.next().charAt(0);
        int intTemp3 = sc.nextInt();

        // 변수 정의
        int intResult = 0;

        // 조건문
        if (charStatus1 == 'Y' && intTemp1 >= 37) {
            intResult += 1;
        }
        if (charStatus2 == 'Y' && intTemp2 >= 37) {
            intResult += 1;
        }
        if (charStatus3 == 'Y' && intTemp3 >= 37) {
            intResult += 1;
        }

        // 출력
        if (intResult >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}