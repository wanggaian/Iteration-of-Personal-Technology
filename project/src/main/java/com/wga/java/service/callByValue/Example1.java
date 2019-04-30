package com.wga.java.service.callByValue;

/**
 * Example1
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/11 15:01
 */
public class Example1 {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        swap(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
