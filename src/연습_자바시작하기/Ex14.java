package 연습_자바시작하기;

public class Ex14 {
    public static void main(String[] args) {
        int price = 152365;

        int oman = price/50000;
        int a = price%50000;
        int man = a /10000;
        int b = a %10000;
        int ochun = b/5000;
        int c = b%5000;
        int chun = c/1000;

        int discount = c%1000;

        int totalCnt = oman+man+ochun+chun;

        System.out.printf("5만원 x %d\n",oman);
        System.out.printf("1만원 x %d\n",man);
        System.out.printf("5천원 x %d\n",ochun);
        System.out.printf("1천원 x %d\n",chun);
        System.out.println("-----------------");
        System.out.printf("총 장수: %d장\n",totalCnt);
        System.out.printf("금액: %d원\n", price-discount);
        System.out.printf("할인: %d원\n",discount);

    }
}
