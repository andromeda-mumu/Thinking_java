package com.example.thinking_test.chap_03;

/**
 * Created by mumu on 2020/12/19.
 * 功能描述：
 */
public class test_13 {
    public static void main(String[] args) {
        char a ='a';
        char A ='A';
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(A));

        boolean b1 = true;
        boolean b2= false;
        System.out.println(b1&=b2);
        System.out.println(b1|=b2);
        System.out.println(b1^=b2);
    }
}
