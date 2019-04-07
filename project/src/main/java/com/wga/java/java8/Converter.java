package com.wga.java.java8;

import java.lang.FunctionalInterface;

/**
 * Converter
 *
 * @Author wanggaian
 * @Date 2019/3/17 12:29
 */
@FunctionalInterface
public interface Converter<F, T> {

    T converter(F from);

}
