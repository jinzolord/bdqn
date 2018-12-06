package cn.tcbd.dao;

import cn.tcbd.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User login(@Param("userName")String userName, @Param("password")String password);
    //User login(String userName, String password);

    List<User> getUser();
}
