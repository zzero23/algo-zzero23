// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 출력
        while (intA < intB + 1) {
            if (intA % 2 == 0) {
                System.out.print(intA + " ");
            }
            intA++;
        }
    }
}