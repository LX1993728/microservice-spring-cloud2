package com.liuxun.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/user/index")
    public String userIndex(){
        return "user/index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        return "login";
    }

    @GetMapping("/401")
    public String accessDenied(){
        return "401";
    }

    @GetMapping("/getInfo")
    @ResponseBody
    public Object getRemoteUser(HttpServletRequest request){
        Map<String,Object> infoMap = new HashMap<>();
        infoMap.put("getRemoteUser",request.getRemoteUser());
        infoMap.put("getUserPrincipal",request.getUserPrincipal());

       return infoMap;

    }
}
