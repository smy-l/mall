package mall.dao;

import mall.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    List<Menu> getMenuByParentId(@Param("parentId") Long parentId);

    List<Menu> getMenListByParSizeNum(@Param("parentId") Long parentId, @Param("pageSize") Integer pageSize, @Param("pageNum") Integer pageNum);

    List<Menu> getMenuList();

    int deleteByPrimaryKey(Long id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}