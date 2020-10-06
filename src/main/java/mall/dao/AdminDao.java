package mall.dao;

import mall.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {

    Admin selectAdminByUsername(@Param("username") String username);

    Admin adminLogin(@Param("username") String username, @Param("password") String password);

    List<Admin> getAdminLisByKeyword(@Param("keyword") String keyword, @Param("pageSize") Integer pageSize, @Param("pageNum") Integer pageNum);

    List<Admin> getAdminList();

    int deleteByPrimaryKey(Long id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}