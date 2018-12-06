package cn.tcbd.service;

import cn.tcbd.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    User login(String userName, String password);

    PageInfo<User> getUser(int pageNum, int pageSize);
}
