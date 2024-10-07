package 연습_메소드;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00,40);
        printPay(10.00,50);
        printPay(7.50,38);
        printPay(8.50,66);
    }

    private static void printPay(double basepay, int hour) {
        double pay = basepay * hour;
        if (hour>60){
            System.out.print("초과 근무시간 에러!");
            return;
        } else if (basepay<8.00){
            System.out.println("최저 시급 에러!");
            return;
        } else if (hour>40){
            pay = pay-(basepay*(hour-40))+(basepay * 1.5 * (hour-40));
        }


        System.out.printf("$ %.2f\n", pay);
    }
}
