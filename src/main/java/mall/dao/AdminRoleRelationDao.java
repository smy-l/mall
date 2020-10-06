package mall.dao;

import mall.entity.AdminRoleRelation;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleRelationDao {

    void deleteByAdminId(@Param("adminId") Long adminId);

    AdminRoleRelation selectByAdminId(@Param("adminId") Long adminId);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRoleRelation record);

    int insertSelective(AdminRoleRelation record);

    AdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminRoleRelation record);

    int updateByPrimaryKey(AdminRoleRelation record);
}