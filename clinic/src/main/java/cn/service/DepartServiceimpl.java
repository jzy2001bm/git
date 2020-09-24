package cn.service;

import cn.entity.Depart;
import cn.mapper.DepartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceimpl implements DepartService{
    @Autowired
    DepartMapper mapper;
    @Override
    public List<Depart> selectAll() {
        return mapper.selectAll();
    }
}
