public class Main {
    public static void main(String[] args) {
        // 변수 정의 1
        int intA = 5, intB = 6, intC = 7;
        int intTemp = intA;

        // 변수 정의 2
        intA = intC;
        intC = intB;
        intB = intTemp;

        // 출력
        System.out.printf("%d\n%d\n%d", intA, intB, intC);
    }
}