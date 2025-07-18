// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();

        // 조건문 
        if ((numN % 2 != 0 && numN % 3 == 0) || (numN % 2 == 0 && numN % 5 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}