package 연습_자바API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i); // 1~45
        }

        //섞는다
        Collections.shuffle(numbers);
        //뽑는다
        int[] picked = new int[6];
        for (int i = 0; i < 6; i++) {
            picked[i] = numbers.get(i);
        }
        System.out.printf("자동 생성 번호: %s", Arrays.toString(picked));
    }
}
