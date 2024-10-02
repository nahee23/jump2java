package ch03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {
        //문자열을 추가하거나 변경할때 사용하는 자료형 / 객체타입 - new 써야함
        StringBuffer sb = new StringBuffer(); //StringBuffer 객체 sb 생성
        System.out.println(sb);
        //버퍼 객체는 append 메소드를 사용해서 문자열을 추가한다.
        sb.append("Hello World");
        sb.append(" ");
        sb.append("점프 to 자바");

        System.out.println(sb);
        String s = "헬로우";
        s = "헬로우 점프 to 자바";
        //그냥 문자열은 바꿀수는 있지만 추가는 안됨.

        //sb 대신 문자열로 해보자. ("" 문자열(리터럴)을 만들면 수정할수 없다.)
        String result = "";
        result += "헬로우"; // result = result + "헬로우"
        result += " ";
        result += "점프 to 자바";
        System.out.println(result);

        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0,"hello "); // 0번째 인덱스에 추가됨
        System.out.println(sb2);

        //substring 문자열 잘라내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb3.substring(0,4)); //시작번호, 끝번호-1 까지 잘라냄
    }
}
