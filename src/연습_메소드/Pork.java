package 연습_메소드;

public class Pork {
    public static void main(String[] args) {
        int n = 3;
        double result = calorieCalculator(n);
        System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);
    }

    private static double calorieCalculator(int n) {
        return  180 * 5.179 * n;
    }
}
