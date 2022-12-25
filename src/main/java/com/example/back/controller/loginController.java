package com.example.back.controller;

import com.example.back.pojo.User;
import com.example.back.result.Result;
import com.example.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class loginController {
    @Autowired
    UserService userService;
    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
            // 对 html 标签进行转义，防止 XSS 攻击
            String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User user = userService.get(username,requestUser.getPassword());
        if(user==null){
            String message = "账号或密码错误！";
            return new Result(400,message,null);
        }
        else{
            String message = "登录成功";
            return new Result(200,message,null);
        }
    }
}
