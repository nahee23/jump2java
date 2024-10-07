package 연습_메소드;

public class Walking {
    public static void main(String[] args) {
        double result = calculateCalory(5000);
        System.out.printf("소모 칼로리: %.1f kcal", result);
    }
    private static double calculateCalory(int walk) {
        return 0.02 * walk; //걸음당 0.02kcal
    }
}
