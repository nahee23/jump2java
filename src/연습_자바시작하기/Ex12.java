package 연습_자바시작하기;

public class Ex12 {
    public static void main(String[] args) {
        int num = 374;
        int oneDigit = num % 10;
        int twoDigits = (num / 10)%10;
        int threeDigits = num / 100;

        int hap = oneDigit + twoDigits + threeDigits;
        System.out.println("총합:" + hap);
    }
}
