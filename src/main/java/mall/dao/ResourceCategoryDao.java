package mall.dao;

import mall.entity.UmsResourceCategory;

import java.util.List;

public interface ResourceCategoryDao {

    List<UmsResourceCategory> getAllResourceCategoryList();

    int deleteByPrimaryKey(Long id);

    int insert(UmsResourceCategory record);

    int insertSelective(UmsResourceCategory record);

    UmsResourceCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsResourceCategory record);

    int updateByPrimaryKey(UmsResourceCategory record);
}