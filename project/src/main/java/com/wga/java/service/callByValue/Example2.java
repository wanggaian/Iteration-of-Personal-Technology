package com.wga.java.service.callByValue;

/**
 * Example2
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/11 15:26
 */
public class Example2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println("arr[0]=" + arr[0]);
    }

    public static void change(int[] array) {
        array[0] = 0;
    }
}
