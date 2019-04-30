package com.wga.java.service.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * LambdaExpress
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/14 16:24
 */
public class LambdaExpress {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("buff", "away", "goal", "girl", "z2", "g1");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
//                return b.compareTo(a);
                return a.compareTo(b);
            }
        });
        System.out.println(names.get(0));
        // FIXME: 2019/3/14 数组打印
        System.out.println(Arrays.toString(names.toArray()));
        System.out.println("==============================");

        // TODO: 2019/3/14 lambda sort
        List<String> name = Arrays
                .asList("buff", "away", "goal", "girl", "z2", "g1");
        Collections.sort(name, (String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println(Arrays.toString(name.toArray()));

        Collections.sort(name, (String a, String b) -> a.compareTo(b));
        System.out.println(Arrays.toString(name.toArray()));

    }
}
