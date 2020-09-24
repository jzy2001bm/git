package cn.mapper;

import cn.entity.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    Login selectByid(Login login);

}
