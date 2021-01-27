package com.wang.jufeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wjf
 * @version 1.0
 * @date 2021/1/13 16:36
 * @desc
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "SSSSS";
    }
}
