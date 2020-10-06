package mall.controller;

import mall.dto.Data;
import mall.dto.Message;
import mall.entity.Role;
import mall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class RoleController {

  @Autowired
  private RoleService roleService;

  @RequestMapping("/role/list")
  @ResponseBody
  public Message getRoleList(String keyword, Integer pageSize, Integer pageNum) {
    List<Role> roleList = roleService.getRoleList(keyword, pageSize, pageNum);
    int total = roleService.getRoleListAll().size();
    int totalPage = (roleList.size() / pageSize) + 1;
    Data data = Data.data(roleList, pageNum, pageSize, total, totalPage);
    return Message.success("操作成功", data);
  }

  @RequestMapping("/role/listAll")
  @ResponseBody
  public Message getRoleListAll() {
    List<Role> data = roleService.getRoleListAll();
    return Message.success("操作成功", data);
  }

  @RequestMapping("/role/update/{id}")
  @ResponseBody
  public Message updateRole(@PathVariable("id") long id, @RequestBody Role role) {
    roleService.updateRole(id, role);
    return Message.success("操作成功");
  }

  @RequestMapping("/role/updateStatus/{id}")
  @ResponseBody
  public Message updateRoleStatus(@PathVariable("id") long id, Integer status) {
    roleService.updateRoleStatus(id, status);
    return Message.success("操作成功");
  }

  @RequestMapping("/role/delete")
  @ResponseBody
  public Message deleteRole(Long[] ids) {
    roleService.deleteRole(ids);
    return Message.success("删除成功");
  }

  @RequestMapping("/role/create")
  @ResponseBody
  public Message createRole(@RequestBody Role role) {
    roleService.insertRole(role);
    return Message.success("创建成功");
  }

}
