package ch03;

import java.util.HashMap;

public class Ch03_맵 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        // 맵은 추가를 put 으로 함
        map.put("people","사람");
        map.put("baseball","야구");

        // 자료를 가져올때 get(키)
        System.out.println(map.get("people"));

        // containsKey : 맵에 해당 key 가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("baseball3"));

        // remove(키) : 삭제, 삭제된 값 리턴됨, 리스트에서는 (인덱스번호 또는 값)
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));
        System.out.println(map.containsKey("people"));

        // size : 갯수
        System.out.println(map.size());

        // keySet : 맵의 모든 키를 리턴
        System.out.println(map.keySet());
        map.put("apple","사과");
        System.out.println(map.keySet());

        // values : 맵의 value 값들만 출력
        System.out.println(map.values());


    }
}
