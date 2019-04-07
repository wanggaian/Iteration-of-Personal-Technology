package com.wga.java.java8;

/**
 * FunctionalInterface
 * 函数式接口
 *
 * @Author wanggaian
 * @Date 2019/3/17 12:58
 */
public class FunctionalInterface {

    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.converter("123");
        System.out.print(converted.getClass());
    }
}
