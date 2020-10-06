package mall.service;

import mall.entity.Admin;

import java.util.List;

public interface AdminService {

  Admin selectAdminByUsername(String username);

  Admin getAdminById(Long id);

  Admin adminLogin(Admin admin);

  void deleteAdminById(Long id);

  List<Admin> getAdminListByKeyword(String keyword, Integer pageSize, Integer pageNum);

  List<Admin> getAdminList();

  void registerAdmin(Admin admin);

  void updateAdmin(Long id, Admin admin);

  void updateAdminLoginTime(Admin admin);

}
