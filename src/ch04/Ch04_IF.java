package ch04;

import java.util.ArrayList;

public class Ch04_IF {
    public static void main(String[] args) {
        /* Ctrl + shift + '/' = 여러줄 주석*/
        /* if 문 */
        int money = 2000;
        boolean hascard = true;
        if (money >= 3000 || hascard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

        // if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money1")) {
            System.out.println("현금으로 택시를 타고 가라");
        } else if (hascard) { //조건에 hascard && false를 쓸 경우 false로 인식 else로 넘어감
            System.out.println("카드로 택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
    }
}
