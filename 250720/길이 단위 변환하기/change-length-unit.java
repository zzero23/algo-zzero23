public class Main {
    public static void main(String[] args) {
        // 변수 정의
        double dblFt = 9.2, dblMi = 1.3;

        // 연산
        double dblFtcm, dblMicm;
        dblFtcm = dblFt * 30.48;
        dblMicm = dblMi * 160934;

        // 출력
        System.out.printf("%.1fft = %.1fcm\n", dblFt, dblFtcm);
        System.out.printf("%.1fmi = %.1fcm", dblMi, dblMicm);
    }
}