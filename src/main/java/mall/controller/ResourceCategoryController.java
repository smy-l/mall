package mall.controller;

import mall.dto.Message;
import mall.entity.UmsResourceCategory;
import mall.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ResourceCategoryController {

  
  @Autowired
  private ResourceCategoryService resourceCategoryService;

  @RequestMapping("/resourceCategory/listAll")
  @ResponseBody
  public Message getAllResCate() {
    List<UmsResourceCategory> data = resourceCategoryService.getResourceCateList();
    return Message.success("操作成功", data);
  }

  @RequestMapping("/resourceCategory/create")
  @ResponseBody
  public Message insertResourceCategory(@RequestBody UmsResourceCategory resourceCategory) {
    resourceCategoryService.insertResourceCategory(resourceCategory);
    return Message.success("添加成功");
  }

  @RequestMapping("/resourceCategory/delete/{id}")
  @ResponseBody
  public Message deleteResCateById(@PathVariable("id") Long id) {
    resourceCategoryService.deleteResCateById(id);
    return Message.success("删除成功");
  }

  @RequestMapping("/resourceCategory/update/{id}")
  @ResponseBody
  public Message updateResCate(@PathVariable("id") Long id, UmsResourceCategory umsResourceCategory) {
    resourceCategoryService.updateResCate(id, umsResourceCategory);
    return Message.success("更新成功");
  }
}
