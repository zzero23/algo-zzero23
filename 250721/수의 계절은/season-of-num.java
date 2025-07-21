// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intM = sc.nextInt();

        // 변수 정의
        String strSeason;

        // 조건문
        if (intM == 3 || intM == 4 || intM == 5) {
            strSeason = "Spring";
        } else if (intM == 6 || intM == 7 || intM == 8) {
            strSeason = "Summer";
        } else if (intM == 9 || intM == 10 || intM == 11) {
            strSeason = "Fall";
        } else {
            strSeason = "Winter";
        }

        // 출력
        System.out.println(strSeason);
    }
}