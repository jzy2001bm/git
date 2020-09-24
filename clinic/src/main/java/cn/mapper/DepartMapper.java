package cn.mapper;

import cn.entity.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartMapper {
    @Select("select * from depart")
    List<Depart> selectAll();
}
