package com.wga.service.factory;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * test
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/21 19:40
 */
public class test {

    @Test
    public void test() {
        System.out.println(Integer.bitCount(12345678));
        System.out.println(Integer.highestOneBit(12345678));
        Integer num = 987654321;
        System.out.println(num.toString().lastIndexOf("8"));
        System.out.println(num.toString().length());
        List<Integer> list = new ArrayList<>(8);
        System.out.println(list.size());
        List<String> split = Arrays.asList(num.toString().split(""));
        System.out.println(Arrays.toString(split.toArray()));
    }
}
