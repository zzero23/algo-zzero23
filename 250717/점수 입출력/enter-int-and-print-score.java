import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        // 문자형으로 변환
        String score = sc.next();

        // 출력
        System.out.println("Your score is " + score + " point.");
    }
}