package src.ch120;

class AgeNotValidException extends Exception {
    AgeNotValidException(String message) {
        super(message);
    }
}

public class ThrowExample {
    static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("나이가 18세 미만입니다.");
        } else {
            System.out.println("접근 허용");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);   // 변경..
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

