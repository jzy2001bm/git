package cn.service;

import cn.entity.Login;
import cn.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceimpl implements LogService {
    @Autowired
    LogMapper mapper;
    @Override
    public String selectByid(Login login) {
        Login login1 = mapper.selectByid(login);
        String s=null;
        if (login1!=null){
            s="success";
        }
        return s;
    }
}
