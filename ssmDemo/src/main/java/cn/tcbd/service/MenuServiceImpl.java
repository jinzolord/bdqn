package cn.tcbd.service;

import cn.tcbd.dao.MenuMapper;
import cn.tcbd.entity.TMenu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<TMenu> getAllMenu(int userId) {
        return menuMapper.getAllMenu(userId);
    }

    @Override
    public PageInfo<TMenu> getMenu(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<TMenu>(menuMapper.getMenu());
    }
}
