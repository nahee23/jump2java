package 연습_배열과반복문;

public class Ex04 {
    public static void main(String[] args) {
        String s = "Programming is fun! right?";

int[] result = count(s);

        System.out.printf("%s\n=> 자음 %d개, 모음 %d개", s, result[0], result[1]);
    }


private static int[] count(String s) {
        int conso = 0;
        int vowel = 0;

        char[] chars = s.toUpperCase().toCharArray();


        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                  vowel++;
                  break;

                case ' ':
                case '\t':
                case '\n':
                case ',':
                case '.':
                case '!':
                case '?':
                    break;

                default:
                    conso++;
                    break;
            }
        }
        return new int[] { conso, vowel };
    }

}
