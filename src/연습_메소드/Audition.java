package 연습_메소드;

public class Audition {
    public static void main(String[] args) {
        double tomVocal = 8.8;
        double tomDance = 7.6;
        double kateVocal = 9.2;
        double kateDance = 7.8;

        System.out.printf("Tom의 오디션 결과: %s\n", score(tomVocal, tomDance));
        System.out.printf("kate의 오디션 결과: %s\n", score(kateVocal, kateDance));

    }

    private static String score(double Vocal, double Dance) {
        double score = Vocal * Dance;
        return (score>=70.0) ?"합격":"불합격";

    }
}
