package 연습_자바API;

import java.util.HashMap;

public class Marathon {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"병주","병현","승언"},new String[]{"병현","승언"}));
        System.out.println(solution(new String[]{"병주","병현","승언","송군"}, new String[]{"병주","병현","송군"}));
        System.out.println(solution(new String[]{"병주","병현","승언","병현"}, new String[]{"병주","병현","승언"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : participant) {
            if (hm.get(s)==null) {
                hm.put(s, 1);
            } else {
                int value = hm.get(s) + 1;
                hm.put(s, value);

            }
        }

        for (String s : completion) {
            hm.put(s, hm.get(s)-1);
        }

        for (String s : hm.keySet()) {
            if (hm.get(s)==1) {
                answer = s;
            }
        }
        return answer;
    }
}
