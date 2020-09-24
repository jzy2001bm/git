package cn.service;

import cn.entity.Doctor;
import cn.entity.Page;

import java.util.List;

public interface DocService {
    List<Doctor> selectAll(Page page);

    int count();

    int updates(Doctor doctor);

    int insert(Doctor doctor);
}
