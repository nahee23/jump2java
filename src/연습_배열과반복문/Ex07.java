package 연습_배열과반복문;

public class Ex07 {
    public static void main(String[] args) {
        int[] bacteriaCountLogs = new int[10];

        writeLog(bacteriaCountLogs);

        printLog(bacteriaCountLogs);
    }

    private static void writeLog(int[] bacteriaCountLogs) {
        int gap = 1;
        for (int i = 0; i < bacteriaCountLogs.length; i++) {
            if (i == 0) {
                bacteriaCountLogs[0] = 1;
            } else {
                bacteriaCountLogs[i] = gap * 2;
                gap *= 2;
            }
        }
    }

    /*Math.pow => 제곱 함수
      for (int i =0; i < bacteriaCountLogs.length; i++) {
            bacteriaCountLogs[i] = (int) Math.pow(2, i) */

    private static void printLog(int[] arr) {
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
            if (i != arr.length - 1) {
                System.out.printf(",");
            }
        }
        System.out.printf("]");
    }
}
