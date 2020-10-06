package mall.service;

import mall.entity.UmsResourceCategory;

import java.util.List;

public interface ResourceCategoryService {

  void insertResourceCategory(UmsResourceCategory resourceCategory);

  List<UmsResourceCategory> getResourceCateList();

  void deleteResCateById(Long id);

  void updateResCate(Long id, UmsResourceCategory resourceCategory);
}
