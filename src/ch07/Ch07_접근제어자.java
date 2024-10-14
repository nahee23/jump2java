package ch07;

class Sample {
    private String secret;

    public String getSecret(String secret) {
        return secret;
    }
}


public class Ch07_접근제어자 {
    private String password;
    public static void main(String[] args) {
        /* 접근 제어자 : 변수나 메서드에 사용권한을 설정 */
        /* private < default < protected < public */
        Ch07_접근제어자 ch = new Ch07_접근제어자();
        ch.password = "1234";

        /* private 는 같은 클래스에서만 사용 가능*/
        Sample sample = new Sample();
        // sample.secret = "비밀";
        // sample.getSecret("비밀");
         String secret = sample.getSecret("비밀");
         System.out.println(secret);
    }
}
