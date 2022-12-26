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
public class registerController {
    @Autowired
    UserService userService;
    @CrossOrigin
    @PostMapping(value = "api/register")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String userid = requestUser.getUserId();
        userid = HtmlUtils.htmlEscape(userid);
        User addUser = requestUser;
        System.out.println(addUser.getPassword());
        System.out.println(addUser.getUserId());
        System.out.println(addUser.getUsername());
        boolean userExistFlag = userService.isExist(userid);
        if(!userExistFlag){
            String message = "用户不存在";
            userService.add(addUser);
            return new Result(200,message,null);
        }
        else{
            String message = "用户已经存在，请确认输入的身份证号！";
            return new Result(400,message,null);
        }
    }
}
