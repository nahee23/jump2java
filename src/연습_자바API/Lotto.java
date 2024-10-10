package 연습_자바API;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();

        int[] numbers = machine.getLottoNumbers();

        System.out.print("생성 번호: ");
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
    }
}

class LottoMachine {
    private int[] LottoNumbers;

    public LottoMachine() {
        LottoNumbers = generate();
    }

    private int[] generate() {
        int[] pickedNumbers = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            pickedNumbers[i] = random.nextInt(45) + 1;
        }
        return pickedNumbers;
        }

    public int[] getLottoNumbers() {
        return LottoNumbers;
    }
}