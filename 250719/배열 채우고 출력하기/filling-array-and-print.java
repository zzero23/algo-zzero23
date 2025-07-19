// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String inputChar = sc.nextLine();
        String[] arrayChar = inputChar.split(" ");

        // 반복문
        for (int i = 9; i > -1; i--) {
            System.out.print(arrayChar[i]);
        }
    }
}