package cn.service;

import cn.entity.Depart;
import cn.entity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartService {
    List<Depart> selectAll();


}
