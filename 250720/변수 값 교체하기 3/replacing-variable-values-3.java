public class Main {
    public static void main(String[] args) {
        // 변수 정의 1
        int intA = 3, intB = 5;
        int intTemp = intA;

        // 변수 정의 2
        intA = intB;
        intB = intTemp;

        // 출력
        System.out.printf("%d\n%d", intA, intB);
    }
}