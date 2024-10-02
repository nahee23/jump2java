package 연습_자바시작하기;

public class Ex13 {
    public static void main(String[] args) {
        double time = 5.0;
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double initialPosition = 1000.0;

        double finalPosition = (0.5*gravity*time*time)+(initialVelocity*time)+initialPosition;

        System.out.printf("%.2f초 후 위치: %.2fm\n", time, finalPosition);
    }
}
