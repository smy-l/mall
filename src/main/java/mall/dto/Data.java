package mall.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data extends HashMap<String, Object> {

  public static Data data(List<?> list, Integer pageNum, Integer pageSize, Integer total, Integer totalPage) {
    Data data = new Data();
    data.put("list", list);
    data.put("pageSize", pageSize);
    data.put("pageNum", pageNum);
    data.put("total", total);
    data.put("totalPage", totalPage);
    return data;
  }

  public static Data data(List<?> parentList, List<?> children) {
    Data data = new Data();
    Map<String, Object> childrenMap = new HashMap<>();
    childrenMap.put("children", children);
    data.put("children", children);
    data.put("", parentList);
    return data;

  }


}
