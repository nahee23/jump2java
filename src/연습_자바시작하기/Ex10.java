package 연습_자바시작하기;

public class Ex10 {
    public static void main(String[] args) {
        int man = 10000;
        int ochun = 5000;
        int chun = 1000;

        man *= 3;
        ochun *= 4;
        chun *= 7;

        int sum = man + ochun + chun;
        System.out.println(sum+"원");
    }
}
