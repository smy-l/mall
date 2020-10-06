package mall.dao;

import mall.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {

    List<Role> getRoleListAll();

    List<Role> getRoleListByKeyword(@Param("keyword") String keyword, @Param("pageSize") Integer pageSize, @Param("pageNum") Integer pageNum);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}