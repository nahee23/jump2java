package 연습_배열과반복문;

public class Ex03 {
    public static void main(String[] args) {
        int[] evens = {0,2,4,6,8};
        int[] odds = {1,3,5,7,9};
        
        int[] result = merge(evens,odds);

        System.out.printf("결과: ");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
    }

    private static int[] merge(int[] evens, int[] odds) {
        int[] mergeArr = new int[evens.length+odds.length];

        for (int i = 0; i < 10; i++) {
            if (i==0) {
                mergeArr[i] = evens[i];
            } else if (i%2==0 && i!=0){
                mergeArr[i] = evens[i/2];
            } else {
                mergeArr[i] = odds[i/2];
            }

            } return mergeArr;
    }


}
