package com.example.thinking_test.chap_03;

/**
 * Created by mumu on 2020/12/19.
 * 功能描述：
 */
public class test_12 {
    public static void main(String[] args) {
        int a= 0xffffffff;
        System.out.println(Integer.toBinaryString(a));
        a=a<<1;
        System.out.println(Integer.toBinaryString(a));
        for(int i=0;i<32;i++){
            a = a>>>1;
            System.out.printf("%32s\n",Integer.toBinaryString(a));
        }
    }
}
