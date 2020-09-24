package cn.controller;

import cn.entity.Depart;
import cn.entity.Doctor;
import cn.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("de")
@ResponseBody
public class DepartController {
    @Autowired
    DepartService service;

    @RequestMapping("selectAll")
    public List<Depart> selectAll(){
        return service.selectAll();
    }


}
