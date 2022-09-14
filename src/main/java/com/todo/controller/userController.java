package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangshaojie
 * @create 2022-09-14 11:50
 */
@Controller
public class userController {
    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
