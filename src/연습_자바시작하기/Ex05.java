package 연습_자바시작하기;

public class Ex05 {
    public static void main(String[] args) {
        int euro = 52;
        int dollar = 32;

        double euroToKwnRate = 1281.62664;
        double dollarToEuroRate = 1091.70306;

        double kwn = (euro * euroToKwnRate)+(dollar * dollarToEuroRate);

        System.out.printf("환전결과: %.0f원", kwn);
    }
}
