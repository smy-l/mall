package mall.service;

import mall.entity.Menu;

import java.util.List;

public interface MenuService {
  void createMenu(Menu menu);

  void updateMenu(Menu menu);

  List<Menu> getMenuList();

  List<Menu> getMenuListByParSizeNum(Long parent, Integer pageSize, Integer pageNum);

  List<Menu> getMenuListByParentId(Long parentId);
}
