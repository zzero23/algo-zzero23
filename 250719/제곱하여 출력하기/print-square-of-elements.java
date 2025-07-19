// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        // 입력1 - 원소 개수
        int intCount = sc.nextInt();
        sc.nextLine();
        // 입력2 - 배열
        int[] arrayInt = new int[intCount];
        for (int i = 0; i < intCount; i++) {
            arrayInt[i] = sc.nextInt();
        }

        // 반복문
        for (int i = 0; i < intCount; i++) {
            int intResult = arrayInt[i] * arrayInt[i];
            System.out.print(intResult + " ");
        }
    }
}