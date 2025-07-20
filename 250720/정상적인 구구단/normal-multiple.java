// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 반복문
        for (int i = 1; i < intN + 1; i++) {
            for (int j = 1; j < intN + 1; j++) {
                if (j == intN) {
                    System.out.printf("%d * %d = %d", i, j, i*j);
                } else {
                    System.out.printf("%d * %d = %d, ", i, j, i*j);
                }
            }
            System.out.println("");
        }
    }
}