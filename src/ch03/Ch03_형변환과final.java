package ch03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_형변환과final {
    public static void main(String[] args) {
        String num = "123"; //문자열
        int n = Integer.parseInt(num);
        System.out.println(n);

        String num2 = "3.123"; //문자열
        Double n2 = Double.parseDouble(num2);
        System.out.println(n2);

        //반대로 정수를 문자열로 변환
        int n3 = 456;
        String num3 = "" + n3; // 1.문자열 더하기 숫자는 문자열이 됨
        System.out.println(num3);
        String num4 = String.valueOf(n3); // 2. String.valueOf(정수)
        String num5 = Integer.toString(n3); // 3. Integer.toString(정수)

        //정수와 실수 변환
        int n4 = 123;
        double d1 = n4; //정수 => 실수 (자동변환)
        System.out.println(d1);

        //실수 => 정수 바로안됨
        double d2 = 123.456;
        int n5 = (int) d2; //캐스팅 (변환타입)
        System.out.println(n5);

        //형변환시 주의점 (변환될 타입과 문자열 내용이 틀리면 오류)
        String num6 = "123.456"; //문자열 안은 실수
        //int n6 = Integer.parseInt(num6); //정수로 변환 => 오류
        double d6 = Double.parseDouble(num6);
        System.out.println(d6);

        //final 키워드는 값을 한번만 설정
        final int n7 = 123;
        //n7 = 456; 오류 final은 값을 변경할수 없다.
        System.out.println(n7);
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));
        a.add("d");
        a.remove("d");
        System.out.println(a);
        // a = new ArrayList<>(); 오류 리스트에 add remove는 가능하지만 새로운 리스트 더 만드는 건 X
    }
}
