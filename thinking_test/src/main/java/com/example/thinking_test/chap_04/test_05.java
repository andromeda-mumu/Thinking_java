package com.example.thinking_test.chap_04;

/**
 * Created by mumu on 2020/12/22.
 * 功能描述：
 * 补码：计算机系统一律用这个表示和存储。因为补码可以将符号位和数值域统一处理，同时加法和减法也可以统一处理
 * 正数补码是自身，也等于反码
 * 负数补码= 模-负数的绝对值 。 （也等于  反码+1）
 *
 * 位操作符所操作的数值在计算机对应的是补码形式呈现
 *
 * 使用按位操作符 来完成 Integer.toBinaryString()
 *
 * https://blog.csdn.net/u013386606/article/details/80526486?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-4.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-4.control
 *
 * 一个n进制的数N左移m位后得到的数为：N * n^m
 * 例如：10进制的4左移1位  4*10^1=40
 *      二进制的4左移3位  4*2^3=32
 *
 *
 * /
public class test_05 {
    public static void main(String[] args) {
        byte a = (byte) 0xaa;
        byte b =(byte)0x55;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        byte c = (byte) 12;
        int i = c<0?c+256:c; //byte转int
        System.out.println(Integer.toBinaryString(i));
        System.out.println(getBinaryFromByte(c));
        change(a);
        change(b);
    }
    static String getBinaryFromByte(byte b) {
        StringBuffer sb = new StringBuffer();
        for (int i = 7; i >=0; i--) {
            sb.append(((b&(1<<i))!=0)?'1':'0');
        }
        return sb.toString();
    }
    static void change(byte n){
        byte length =0;
        int copy =n;
        System.out.println(copy);
        copy =(copy & 0xff);
        while (copy>0){
            length++;
            copy=(byte)(copy>>1);
        }
        System.out.println("length:"+length);
        for (int i=length;i>0;i--){
            if((n&(i-1))>0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
}
