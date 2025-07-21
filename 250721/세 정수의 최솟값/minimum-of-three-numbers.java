// import
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        int intC = sc.nextInt();

        // 최솟값 찾기
        int intMin;

        if (intA > intB) {
            if (intB > intC) {
                intMin = intC;
            } else {
                intMin = intB;
            }
        } else {
            if (intA > intC) {
                intMin = intC;
            } else {
                intMin = intA;
            }
        }

        // 출력
        System.out.println(intMin);
    }
}