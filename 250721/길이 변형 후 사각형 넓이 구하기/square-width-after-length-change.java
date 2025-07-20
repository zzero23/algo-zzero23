// import
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intRow = sc.nextInt();
        int intCol = sc.nextInt();

        // 연산
        intRow += 8;
        intCol *= 3;
        int intExtent = intRow * intCol;

        // 출력
        System.out.printf("%d\n%d\n%d", intRow, intCol, intExtent);
    }
}