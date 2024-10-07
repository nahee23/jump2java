package 연습_메소드;

import javax.swing.*;

public class DatingApp {
    public static void main(String[] args) {
        String x = rating(4.2, 4.7, 4.3);
        String y = rating(3.8, 4.1, 3.5);
        String z = rating(3.6, 3.0, 3.4);

        System.out.printf("X -> %s등급\n", x);
        System.out.printf("Y -> %s등급\n", y);
        System.out.printf("Z -> %s등급\n", z);

    }

    private static String rating(double v, double v1, double v2) {
        if (v>=4.0 && v1>=4.0 && v2>=4.0) {
            return "A";
        } else if ((v+v1+v2>=10.0) && (v>=4.0 || v1>=4.0 || v2>=4.0)) {
            return "B";
        } else {
            return "C";
        }
    }
}
