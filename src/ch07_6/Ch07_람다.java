package ch07_6;

import java.util.function.BinaryOperator;

public class Ch07_람다 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        BinaryOperator<Integer> sub = (a, b) -> a - b;
        BinaryOperator<Integer> mul = (a, b) -> a * b;
        BinaryOperator<Integer> div = (a, b) -> a / b;
        BinaryOperator<Integer> mod = (a, b) -> a % b;
        BinaryOperator<Integer> cal = (a, b) -> {
            int c = a * b;
            int d = a / b;
            return c - d;
        };

        System.out.println(sum.apply(2, 3));
        System.out.println(sub.apply(2, 3));
        System.out.println(mul.apply(2, 3));
        System.out.println(div.apply(2, 3));
        System.out.println(mod.apply(2, 3));
        System.out.println(cal.apply(2, 3));
    }
}
