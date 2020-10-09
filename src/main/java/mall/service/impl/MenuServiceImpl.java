package mall.service.impl;

import mall.dao.MenuDao;
import mall.entity.Menu;
import mall.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

  private static final SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  @Autowired
  private MenuDao menuDao;

  @Override
  public void createMenu(Menu menu) {
    menu.setCreateTime(time.format(new Date()));
    menuDao.insert(menu);
  }

  @Override
  public void updateMenu(Menu menu) {
    menuDao.updateByPrimaryKey(menu);
  }

  @Override
  public List<Menu> getMenuList() {
    return menuDao.getMenuList();
  }

  @Override
  public List<Menu> getMenuListByParSizeNum(Long parentId, Integer pageSize, Integer pageNum) {
    return menuDao.getMenListByParSizeNum(parentId, pageSize, (pageNum - 1) * pageSize);
  }

  @Override
  public List<Menu> getMenuListByParentId(Long parentId) {
    return menuDao.getMenuByParentId(parentId);
  }
}
