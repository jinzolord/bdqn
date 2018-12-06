package cn.tcbd.dao;

import cn.tcbd.entity.TMenu;

import java.util.List;

public interface MenuMapper {

    List<TMenu> getAllMenu(int userId);

    List<TMenu> getMenu();

}
