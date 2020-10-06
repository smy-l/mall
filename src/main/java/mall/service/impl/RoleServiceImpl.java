package mall.service.impl;

import mall.dao.RoleDao;
import mall.entity.Role;
import mall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

  private static final SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-yy HH:mm:ss");

  @Autowired
  private RoleDao roleDao;

  @Override
  public List<Role> getRoleList(String keyword, Integer pageSize, Integer pageNum) {
    return roleDao.getRoleListByKeyword(keyword, pageSize, (pageNum - 1) * pageSize);
  }

  @Override
  public List<Role> getRoleListAll() {
    return roleDao.getRoleListAll();
  }

  @Override
  public void updateRole(long id, Role role) {
    Role umsRole = roleDao.selectByPrimaryKey(id);
    umsRole.setAdminCount(role.getAdminCount());
    umsRole.setDescription(role.getDescription());
    umsRole.setName(role.getName());
    umsRole.setSort(role.getSort());
    umsRole.setStatus(role.getStatus());
    roleDao.updateByPrimaryKey(umsRole);
  }

  @Override
  public void updateRoleStatus(long id, Integer status) {
    Role role = roleDao.selectByPrimaryKey(id);
    role.setStatus(status);
    roleDao.updateByPrimaryKey(role);
  }

  @Override
  public void deleteRole(Long[] ids) {
    for (Long id : ids) {
      roleDao.deleteByPrimaryKey(id);
    }
  }

  @Override
  public void insertRole(Role role) {
    role.setCreateTime(time.format(new Date()));
    roleDao.insert(role);
  }
}
