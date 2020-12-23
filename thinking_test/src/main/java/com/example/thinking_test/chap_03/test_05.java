package com.example.thinking_test.chap_03;

/**
 * Created by mumu on 2020/12/19.
 * 功能描述：
 */

public class test_05 {
    public static void main(String[] args) {
        Dog spot= new Dog("spot","ruff");
        Dog scruffy = new Dog("scruffy","wurf");
        System.out.println("spot的名字和叫声："+spot.name+","+spot.says);
        System.out.println("scurffy的名字和叫声:"+scruffy.name+","+scruffy.says);

        /**--------------练习6-------------*/
        Dog three = spot;
        System.out.println(three == spot);
        System.out.println(three.equals(spot));
    }

}

