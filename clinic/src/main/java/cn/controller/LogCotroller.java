package cn.controller;

import cn.entity.Login;
import cn.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("log")
@ResponseBody
public class LogCotroller {
    @Autowired
    LogService service;
    @RequestMapping("selectByid")
    public String selectByid(@RequestBody Login login){
        System.out.println(login);
        return service.selectByid(login);
    }
}
