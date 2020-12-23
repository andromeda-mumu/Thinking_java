package com.example.thinking_test.chap_03;

/**
 * Created by mumu on 2020/12/19.
 * 功能描述：
 */
public class cul {
    public static void main(String[] args) {
//        charTest('a','u');
        byteTest((byte)12,(byte)10);
        System.out.println((int)(1.45f)>>1);
    }

    static void byteTest(byte x,byte y){
        x = (byte) (x*y);
        System.out.println(x);
        System.out.println(~y);
    }
    static void f(boolean b){}
    static void charTest(char x,char y){
        x= (char) -x;
        System.out.println(x);
        x++;
        System.out.println(x);

        x= (char) (x*y);
        System.out.println(x);
        x= (char) (x/y);
        System.out.println(x);
        x= (char) (x%y);
        System.out.println(x);
        x= (char) (x+y);
        System.out.println(x);
        x= (char) (x-y);
        System.out.println(x);
        f(x>y);

    }
}
