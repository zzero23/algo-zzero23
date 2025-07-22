// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intB = sc.nextInt();
        int intA = sc.nextInt();

        // 출력
        while (intB > intA - 1) {
            if (intB % 2 == 0) {
                System.out.print(intB + " ");
            }
            intB--;
        }
    }
}