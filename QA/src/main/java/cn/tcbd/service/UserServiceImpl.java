package cn.tcbd.service;

import cn.tcbd.dao.UserMapper;
import cn.tcbd.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        return this.userMapper.login(userName, password);
    }

    @Override
    public PageInfo<User> getUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<User>(userMapper.getUser());
    }
}
