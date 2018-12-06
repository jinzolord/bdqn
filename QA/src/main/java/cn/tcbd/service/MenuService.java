package cn.tcbd.service;

import cn.tcbd.entity.TMenu;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MenuService {

    List<TMenu> getAllMenu(int userId);

    PageInfo<TMenu> getMenu(int pageNum, int pageSize);
}
