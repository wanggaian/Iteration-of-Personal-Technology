package com.wga.service;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MyFunction
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/2/28 10:47
 */
public class MyFunction {

    private static final long ONEDAY = 24 * 60 * 60 * 1000;

    @Test
    public void getDayLength() {

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date iday = new Date();
        try {
            iday = df.parse("20170829");
        } catch (ParseException e) {
            System.out.println("parse error");
        }
        System.out.println("iday is" + iday.toString());

        Date nowday = new Date();
        System.out.println("now is" + nowday.toString());

        long dayLength = (nowday.getTime() - iday.getTime()) / (24 * 60 * 60 * 1000);

        System.out.println("day length is " + dayLength);
    }

    @Test
    public void getDayLength2() {

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date iday = new Date();
        try {
            iday = df.parse("20170829");
        } catch (ParseException e) {
            System.out.println("parse error");
        }
        System.out.println("iday is" + iday.toString());

        Date nowday = new Date();
        System.out.println("now is" + nowday.toString());

        long dayLength = nowday.getDay() - iday.getDay();

        System.out.println("day length is " + dayLength);
    }

    @Test
    public void specialDate() {
        List<String> dayList = new ArrayList<>();
        Map<String, String> dateMap = new HashMap<>();

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        Date iday = new Date();
        try {
            iday = df.parse("20170829");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date date = new Date(iday.getTime() + 500 * ONEDAY);
        for (int i = 1; i < 100000; i++) {
            dateMap.put(String.valueOf(i), df2.format(new Date(iday.getTime() + i * ONEDAY)));
        }
        System.out.println("together 500 -> " + date.toString());
        System.out.println("together 500 -> " + df.format(date));
        System.out.println("together 600 -> " + dateMap.get("600"));
        System.out.println("together 666 -> " + dateMap.get("666"));
        System.out.println("together 700 -> " + dateMap.get("700"));
        System.out.println("together 1000 -> " + dateMap.get("1000"));
        System.out.println("together 1314 -> " + dateMap.get("1314"));
        System.out.println("together 1500 -> " + dateMap.get("1500"));
        System.out.println("together 2000 -> " + dateMap.get("2000"));
        System.out.println("together 3000 -> " + dateMap.get("3000"));
        System.out.println("together 5000 -> " + dateMap.get("5000"));
        System.out.println("together 10000 -> " + dateMap.get("10000"));
    }
}
