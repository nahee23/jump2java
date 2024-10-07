package 연습_배열과반복문;

public class Ex01 {
    public static void main(String[] args) {
    double start = 72.4;
    int after = 5;

    double result = weight(start,after);

        System.out.printf(after+"개월 후 예상 몸무게 => %.2fkg",result);
    }
    private static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;
        for (int i = 1; i <= months; i++ ) {
            expectedWeight += 0.231;
        }
        return expectedWeight;
    }
}
