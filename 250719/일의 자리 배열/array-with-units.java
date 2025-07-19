// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        for (int i = 0; i < 2; i++) {
            arrayInt[i] = sc.nextInt();
        }

        // 반복문
        for (int i = 0; i < 8; i++) {
            int intSum = arrayInt[i] + arrayInt[i+1];
            if (intSum > 9) {
                intSum -= 10;
            }
            arrayInt[i+2] = intSum;
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}