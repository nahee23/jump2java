package 연습_배열과반복문;

public class Ex02 {
    public static void main(String[] args) {
        String[] cities = {"서울","부산","인천","대전","대구"};
        int[] visitors ={599,51,46,43,27};

        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i]+":"+visitors[i]+"명");
        }
    }
}
