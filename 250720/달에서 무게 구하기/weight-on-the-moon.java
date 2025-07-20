public class Main {
    public static void main(String[] args) {
        // 변수 정의
        int intWeight = 13;
        double dblRatio = 0.165;

        // 연산
        double dblResult = intWeight * dblRatio;

        // 출력 
        System.out.printf("%d * %.6f = %6f", intWeight, dblRatio, dblResult);
    }
}