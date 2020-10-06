package mall.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ums_resource_category
 * @author 
 */
public class UmsResourceCategory implements Serializable {
    private Long id;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "ResourceCategory{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                '}';
    }
}