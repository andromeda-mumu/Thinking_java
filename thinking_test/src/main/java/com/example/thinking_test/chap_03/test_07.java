package com.example.thinking_test.chap_03;

import java.util.Random;

/**
 * Created by mumu on 2020/12/19.
 * 功能描述：
 */
public class test_07 {
    public static void main(String[] args) {
        int a = new Random().nextInt();
        if(a%2==0){
            System.out.println("正面");
        }else{
            System.out.println("反面");
        }
    }
}
