// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String[] arrMynum = sc.next().split("-");

        // 출력
        System.out.printf("%s%s", arrMynum[0], arrMynum[1]);
    }
}