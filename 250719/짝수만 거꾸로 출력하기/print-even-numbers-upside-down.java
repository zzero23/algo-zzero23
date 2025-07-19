// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intCount = sc.nextInt();
        sc.nextLine();

        int[] arrayInt = new int[intCount];
        for (int i = 0; i < intCount; i++) {
            arrayInt[i] = sc.nextInt();
        }

        // 반복 및 조건문
        for (int i = intCount - 1; i > -1; i--) {
            if (arrayInt[i] % 2 == 0) {
                System.out.print(arrayInt[i] + " ");
            }
        }
    }
}