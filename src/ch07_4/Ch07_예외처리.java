package ch07_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ch07_예외처리 {
    public static void main(String[] args) {
        //파일 찾기 예외처리
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("없는파일1.txt"));
            //파일 읽을 수 없을 경우 예외처리
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 못 찾음 "+e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기 또는 닫기 예외발생 "+e.getMessage());
        }


        //산술에 문제 (try 문 예외처리 - 다음거 실행됨)
        int c;
        try {
            c = 4/0; //실행중에 예외발생 - 다음거 실행안함
                     //예외발생 코드는 try 문에 입력 - try 문 실행시 다음거 실행됨
        } catch (ArithmeticException e) {
            System.out.println("수학예외 0으로 나누는 에러 발생! "+e.getMessage());
            //예외가 발생하면 이 문장이 수행된다.
        } finally {
            System.out.println("에러발생 하든 안하든 실행됨!");
        }


        //배열에 인덱스 번호 틀림 (실행중 발생함 - 다음거 실행X)
        try {
            int[] a ={1,2,3};
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 넘기는 예외! "+e.getMessage());
        } finally {
            System.out.println("에러발생 하든 안하든 실행됨!");
        }

        System.out.println("프로그램 종료!");

    }
}
