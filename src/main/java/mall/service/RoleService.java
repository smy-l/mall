package mall.service;

import mall.entity.Role;

import java.util.List;

public interface RoleService {
  List<Role> getRoleList(String keyword, Integer pageSize, Integer pageNum);

  List<Role> getRoleListAll();

  void updateRole(long id, Role role);

  void updateRoleStatus(long id, Integer status);

  void deleteRole(Long[] ids);

  void insertRole(Role role);
}
