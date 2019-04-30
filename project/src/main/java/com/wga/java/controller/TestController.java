package com.wga.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * TestController
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/4/30 11:51
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> hello() {
        Map<String, Object> map = new HashMap<>();
        map.put("hello", "world");
        return map;
    }
}
