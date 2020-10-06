package mall.dto;

import java.util.HashMap;
import java.util.List;

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


}
