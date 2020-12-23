package com.example.thinking_test.chap_03;

/**
 * Created by mumu on 2020/12/19.
 * 功能描述：
 */
public class test_14 {
    public static void main(String[] args) {
        String a1="a";
        String b ="b";
        String a2 = new String("a");
        b=a1;
        fun(a1,b);
    }
    static void fun(String x,String y){
       if(x==y){
           System.out.println("x==y");
       }
       if(x.equals(y)){
           System.out.println("x.equal(y)");
       }
    }
}
