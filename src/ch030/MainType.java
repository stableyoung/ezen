package src.ch030;

import java.util.Date;

public class MainType {
    public static void main(String[] args) {
        // 기본형 타입
        byte myByte = 10;
        System.out.println("My Byte is : " + myByte);

        short myShort = 10;
        System.out.println("My Short is : " + myShort);

        int myNumber = 10;
        System.out.println("My Integer is : " + myNumber);

        long myLong = 10L;
        System.out.println("My Long is : " + myLong);

        float myFloat = 10.0F;
        System.out.println("My Float is : " + myFloat);

        double myDouble = 10.0D;
        System.out.println("My Double is : " + myDouble);

        char myChar = '정';
        System.out.println("My Char is : " + myChar);

        boolean myBoolean = true;
        System.out.println("My Boolean is : " + myBoolean);

        // 참조형(객체) 타입
        String myString = "Hello World!";
        System.out.println("My String is : " + myString);

        // Date
        Date myDate = new Date();
        System.out.println("My Date is : " + myDate);

    }
}

