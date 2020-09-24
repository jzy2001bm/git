package cn.mapper;

import cn.entity.Doctor;
import cn.entity.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DocMapper {
    List<Doctor> selectAll(Page page);

    int count();

    int updates(Doctor doctor);

    int insert(Doctor doctor);
}
