package ch07;

import ch07.house.HouseKim; // or import ch07.house.*;
import ch07.house.HousePark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import java.util.*; //java.util 에 있는 모든 패키지 적용

public class Ch07_패키지 {
    public static void main(String[] args) {
        /*비슷한 성격의 클래스를 모아 둔 폴더?*/
        /*Ctrl 누른채로 글자 클릭하면 설명으로 이동*/
        String str = "미리 임포트 된 패키지 java.lang"; //java.lang
        ArrayList<Integer> list = new ArrayList<>(); //java.util
        double pi = Math.PI; //java.lang
        Random r = new Random(); //java.util
        HashMap<Integer, Integer> map = new HashMap<>(); //java.util

        HouseKim kim = new HouseKim();
        HousePark park = new HousePark();
        // 다른 패키지의 클래스 사용할 때는 import 사용하여 불러온 뒤 사용
    }
}
