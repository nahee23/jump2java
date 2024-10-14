package ch06;

import java.io.*;

public class Ch06_파일입출력 {
    public static void main(String[] args) throws IOException {
        /* 파일 쓰기 : 만약 파일이 없으면 새로만듬 */
        /* FileOutputStream output = new FileOutputStream("c:out.txt");
        for (int i = 1; i < 11; i++) {                  //"c:/Temp/out.txt"
            String data = i + " 번째 줄입니다.\r\n"; // \r\n 커서를 앞으로 한줄띄움
            output.write(data.getBytes()); //바이트로 쓰기
        }
        output.close();*/

        /* FileWriter 문자열을 바로 쓸수 있음, append 값이 true 일때 추가로 작성 */
        /* FileWriter fw = new FileWriter("c:out.txt", true); //true 하면 원래 작성되어 있던 것 이어서 작성?
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.\r\n";
            fw.write(data); //문자열을 바로 입력함.
        }
        fw.close();*/

        /* PrintWriter \r\n 대신 println 메서드 사용 */
         /*PrintWriter pw = new PrintWriter(new FileWriter("c:out1.txt", true));
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();*/

        /* 파일 읽기 : 특정 주소의 파일을 읽어옴 */
        /*FileInputStream input = new FileInputStream("c:out.txt");
        byte[] buf = new byte[1024]; //1024바이트 배열
        input.read(buf);
        System.out.println(new String(buf)); // or String s = new String(bug)
        input.close();                       //    System.out.println(s)*/

        /* 문자열 단위로 읽는 방법 */
        BufferedReader br = new BufferedReader(new FileReader("c:abc.txt"));
        while (true) {
            String line = br.readLine(); //한줄씩 읽음
            if (line == null) break; //더이상 읽을 줄(라인)이 없을때 반복문 빠져나감
            System.out.println(line);
        }
        br.close();

    }
}