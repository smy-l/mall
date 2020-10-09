package mall.controller;

import mall.dto.Data;
import mall.dto.Message;
import mall.entity.Menu;
import mall.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class MenuController {

  @Autowired
  private MenuService menuService;

  @RequestMapping("/menu/treeList")
  @ResponseBody
  public Message getTreeList() {
    List<Menu> parentList = menuService.getMenuListByParentId(0L);
    List<Menu> rlt = getChildrenList(parentList);
    return Message.success("获取成功", rlt);
  }

  private List<Menu> getChildrenList(List<Menu> parentList) {
    List<Menu> childrenList;
    for (Menu menu : parentList) {
      Long parentId = menu.getId();
      childrenList = menuService.getMenuListByParentId(parentId);
      menu.setChildren(childrenList);
      getChildrenList(childrenList);
    }
    return parentList;
  }

  @RequestMapping("/menu/list/{parentId}")
  @ResponseBody
  public Message getMenuList(@PathVariable("parentId") Long parentId, Integer pageSize, Integer pageNum) {
    List<Menu> menuList = menuService.getMenuListByParSizeNum(parentId, pageSize, pageNum);
    int total = menuService.getMenuList().size();
    int totalPage = (menuList.size() / pageSize) + 1;
    Data data = Data.data(menuList, pageNum, pageSize, total, totalPage);
    return Message.success("操作成功", data);
  }

}
