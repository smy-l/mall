package mall.service.impl;

import mall.dao.AdminDao;
import mall.entity.Admin;
import mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

  private static final SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


  @Autowired
  private AdminDao adminDao;

  @Override
  public Admin selectAdminByUsername(String username) {
    return adminDao.selectAdminByUsername(username);
  }

  @Override
  public Admin getAdminById(Long id) {
    return adminDao.selectByPrimaryKey(id);
  }

  @Override
  public Admin adminLogin(Admin admin) {
    return adminDao.adminLogin(admin.getUsername(), admin.getPassword());
  }

  @Override
  public void deleteAdminById(Long id) {
    adminDao.deleteByPrimaryKey(id);
  }

  @Override
  public List<Admin> getAdminListByKeyword(String keyword, Integer pageSize, Integer pageNum) {
    return adminDao.getAdminLisByKeyword(keyword, pageSize, (pageNum - 1) * pageSize);
  }

  @Override
  public List<Admin> getAdminList() {
    return adminDao.getAdminList();
  }

  @Override
  public void registerAdmin(Admin admin) {
    admin.setCreateTime(time.format(new Date()));
    adminDao.insert(admin);
  }

  @Override
  public void updateAdmin(Long id, Admin admin) {
    admin.setId(id);
    adminDao.updateByPrimaryKeySelective(admin);
  }

  @Override
  public void updateAdminLoginTime(Admin admin) {
    admin.setLoginTime(time.format(new Date()));
    adminDao.updateByPrimaryKeySelective(admin);
  }
}
