package com.tjfae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: RCY
 * @Date: 2019/6/5 10:08
 * @Description:
 * @Email: 18600820674@163.com
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String success() {
        return "index";
    }


}
