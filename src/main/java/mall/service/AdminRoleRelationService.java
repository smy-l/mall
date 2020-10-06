package mall.service;

import mall.entity.AdminRoleRelation;

public interface AdminRoleRelationService {

  void insertAdminRoleRelation(Long adminId, Long roleId);

  void deleteRelationByAdminId(Long id);

}
