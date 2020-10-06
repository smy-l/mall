package mall.service.impl;

import mall.dao.AdminRoleRelationDao;
import mall.entity.AdminRoleRelation;
import mall.service.AdminRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleRelationServiceImpl implements AdminRoleRelationService {

  @Autowired
  private AdminRoleRelationDao adminRoleRelationDao;

  @Override
  public void insertAdminRoleRelation(Long adminId, Long roleId) {
    AdminRoleRelation adminRoleRelation = new AdminRoleRelation();
    adminRoleRelation.setAdminId(adminId);
    adminRoleRelation.setRoleId(roleId);
    adminRoleRelationDao.insertSelective(adminRoleRelation);
  }

  @Override
  public void deleteRelationByAdminId(Long adminId) {
    adminRoleRelationDao.deleteByAdminId(adminId);
  }


}
