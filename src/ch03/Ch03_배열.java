package ch03;

public class Ch03_배열 {
    public static void main(String[] args) {
        //정수 int 배열
        int[] odds = {1,3,5,7,9}; //{}
        //문자열 String 배열
        String[] weeks = {"월","화","수","목","금","토","일","휴일"};

        //배열을 객체로 만들기 (new 키워드)
        String[] week = new String[7]; //배열의 길이를 정함 (초기값 없음)
        week[0] = "월";
        week[1] = "화";
        week[2] = "수";
        week[3] = "목";
        week[4] = "금";
        week[5] = "토";
        week[6] = "일";
        //week[7] = "휴일"; 배열의 길이(7) 인덱스는 0부터 6까지이므로 에러

        //배열값에 접근하기 : 목요일 값은 3 (0,1,2,3..)
        System.out.println(weeks[3]);
        System.out.println(week[3]);

        //전체 배열의 값을 한번에 출력
        //반복문 사용해서 배열의 전체 값들을 출력해보자
        for (int i = 0; i < 7; i++) {
            System.out.println(week[i]);
        }

        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }


    }
}
