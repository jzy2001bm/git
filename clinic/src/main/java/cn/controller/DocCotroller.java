package cn.controller;

import cn.entity.Doctor;
import cn.entity.Page;
import cn.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("doc")
public class DocCotroller {
    @Autowired
    DocService service;
    @RequestMapping("selectAll")
    public Map<String,Object> selectAll(Page page){
        System.out.println(page);
        Map map=new HashMap();
        map.put("doc",service.selectAll(page));
        map.put("total",service.count());
        return map;
    }
    @RequestMapping("updates")
    public int updates(Doctor doctor){
        System.out.println(doctor);
        return service.updates(doctor);
    }
    @RequestMapping("insert")
    public int insert(@RequestBody Doctor doc){
        System.out.println(doc);
        return service.insert(doc);
    }
}
