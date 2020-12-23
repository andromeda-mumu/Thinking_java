package com.example.thinking_test.chap_04;

import java.util.Random;

/**
 * Created by mumu on 2020/12/22.
 * 功能描述：
 */
 public class test_03 {
    public static void main(String[] args) {
        Random random = new Random();
        int cur = random.nextInt();
        while(true){
            int num = random.nextInt();
            if(cur<num){
                System.out.println(cur+"小于"+num);
            }else if(cur>num){
                System.out.println(cur+"大于"+num);
            }else {
                System.out.println(cur+"等于"+num);
            }
            cur = num;
        }
    }
}
