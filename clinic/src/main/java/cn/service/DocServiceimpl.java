package cn.service;

import cn.entity.Doctor;
import cn.entity.Page;
import cn.mapper.DocMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DocServiceimpl implements DocService{
    @Autowired
    DocMapper mapper;
    @Override
    public List<Doctor> selectAll(Page page) {
        return mapper.selectAll(page);
    }

    @Override
    public int count() {
        return mapper.count();
    }

    @Override
    public int updates(Doctor doctor) {
       // System.out.println(doctor);
        return mapper.updates(doctor);
    }

    @Override
    public int insert(Doctor doctor) {
        doctor.setStatus("N");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        doctor.setDtime(sdf.format(new Date()));
        return mapper.insert(doctor);
    }
}
