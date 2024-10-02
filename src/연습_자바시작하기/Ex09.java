package 연습_자바시작하기;

public class Ex09 {
    public static void main(String[] args) {
        double meter = 100;
        double sec = 18;

        double km = meter/1000;
        double hours = sec/3600;

        double sisok = km/hours;
        System.out.println(sisok + "km/h");
    }
}
