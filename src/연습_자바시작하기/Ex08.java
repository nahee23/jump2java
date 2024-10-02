package 연습_자바시작하기;

public class Ex08 {
    public static void main(String[] args) {
        int totalSec = 7582;
        int min = totalSec / 60;
        int sec = totalSec % 60;
        int hour = min / 60;
        int min1 = min % 60;

        System.out.printf(" %d 시간 %d 분 %d 초", hour, min1, sec);
    }
}
