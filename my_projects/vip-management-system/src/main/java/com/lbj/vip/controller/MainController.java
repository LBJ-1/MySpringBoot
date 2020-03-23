package com.lbj.vip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author Liu.B.J
 */
@Controller
public class MainController {
    @GetMapping("/main")
    public String main(Model model){
        return "/main/index";
    }

    @GetMapping("/getNavTitle/{navBarTitle}")
    public String getNavTitle(Model model, @PathVariable("navBarTitle") String navBarTitle){
        model.addAttribute("navBarTitle",navBarTitle);
        return "/main/navTitle";
    }

    @GetMapping("/getPage/{page}")
    public String getPage(@PathVariable("page") String page){
        if("普通VIP".equals(page)){
            return "/main/home1";
        }
        if("超级VIP".equals(page)){
            return "/main/home2";
        }
        if("帝王VIP".equals(page)){
            return "/main/home1";
        }
        if("列表1".equals(page)){
            return "/main/home2";
        }
        if("列表2".equals(page)){
            return "/main/home1";
        }
        if("VIP会员列表3".equals(page)){
            return "/main/home2";
        }
        if("VIP会员列表4".equals(page)){
            return "/main/home1";
        }
        return null;
    }

    @GetMapping("/test")
    public String main1(Model model){
        return "/main/home1";
    }

    @GetMapping("/test2")
    public String main2(Model model){
        return "/main/home2";
    }

    @GetMapping("/getHome")
    public String gethome(Model model){
        return "/main/home";
    }

    @GetMapping("/loadLeftNavBar")
    public String getLeftNavBar(){
        return "/main/leftNavArea";
    }
}
