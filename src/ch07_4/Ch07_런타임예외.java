package ch07_4;

//커스텀(만든) 예외 FoolException
class FoolException extends RuntimeException {
}

//일반 예외를 상속한 FoolException2
class FoolException2 extends Exception {
}

class Sample {
    public void sayNick(String nick) {
        try {
            if ("바보".equals(nick)) {
                throw new FoolException(); //예외 객체 생성
            }
            //문제가 없을경우에만 별명을 출력함
            System.out.println("당신의 별명은 " + nick + " 입니다.");
        } catch (FoolException e) {
            System.err.println("FoolException 발생했습니다.");
        }

    }
}

class Sample2 {
    public void sayNick(String nick) throws FoolException2 {
        if ("바보".equals(nick)) {
            throw new FoolException2(); //예외 객체 생성
        }
        //문제가 없을경우에만 별명을 출력함
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }
}


public class Ch07_런타임예외 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.sayNick("바보");
        s.sayNick("야호");

        Sample2 s2 = new Sample2();
        try {
            s2.sayNick("바보"); //예외발생
            s2.sayNick("야호");
        } catch (FoolException2 e) {
            System.out.println("FoolException2 발생 "+e.getMessage());
        }

    }
}
