package com.szss.genisys.settings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zcg on 16/3/15.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping("/page")
    public String page(){
        return "/page";
    }
}
