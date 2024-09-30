package ch03;

public class Ch03_불린 {
    public static void main(String[] args) {
        //불(boolean) : 참 또는 거짓 자료형
        boolean isSuccess = true;  //1
        boolean isTest = false; //0
        // 참 또는 거짓을 판단하는 연산
        // 조건문에 사용하거나 불타입에 대입
        System.out.println(2>1); //참
        System.out.println(2<1); //거짓
        System.out.println(2==1); //거짓
        System.out.println(3%2==1); //참

        // 조건문에 사용
        int base = 180;
        int h = 185;
        boolean isTall = h > base; // base보다 h가 크면 참
        // if 문에는 조건이 참일때만 명령문을 실행
        if (isTall) {
            System.out.println("키가 큽니다.");
        }

    }
}
