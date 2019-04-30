package com.wga.java.service.java8;

/**
 * Java8Default
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/14 16:08
 */
public class Java8Default {

    public static void main(String[] args) {
        // TODO: 2019/3/14 通过匿名内部类方式访问接口
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println("calculate " + formula.calculate(100));
        System.out.println("sqrt " + formula.sqrt(4));
    }
}
