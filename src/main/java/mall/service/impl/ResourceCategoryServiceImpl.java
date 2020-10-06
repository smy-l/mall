package mall.service.impl;

import mall.dao.ResourceCategoryDao;
import mall.entity.UmsResourceCategory;
import mall.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ResourceCategoryServiceImpl implements ResourceCategoryService {

  private static final SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  @Autowired
  private ResourceCategoryDao resourceCategoryDao;

  @Override
  public void insertResourceCategory(UmsResourceCategory resourceCategory) {
    resourceCategory.setCreateTime(time.format(new Date()));
    resourceCategoryDao.insert(resourceCategory);
    resourceCategoryDao.insert(resourceCategory);
  }

  @Override
  public List<UmsResourceCategory> getResourceCateList() {
    return resourceCategoryDao.getAllResourceCategoryList();
  }

  @Override
  public void deleteResCateById(Long id) {
    resourceCategoryDao.deleteByPrimaryKey(id);
  }

  @Override
  public void updateResCate(Long id, UmsResourceCategory resourceCategory) {
    UmsResourceCategory oldRecord = resourceCategoryDao.selectByPrimaryKey(id);
    oldRecord.setName(resourceCategory.getName());
    oldRecord.setSort(resourceCategory.getSort());
    resourceCategoryDao.updateByPrimaryKey(oldRecord);
  }


}
