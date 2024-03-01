package com.ruoyi.merchant.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商户分类对象 mer_category
 * 
 * @author hendatudou
 * @date 2024-02-28
 */
public class MerCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商户分类ID */
    private Integer merCategoryId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String categoryName;

    /** 分类描述 */
    @Excel(name = "分类描述")
    private String categoryDescription;

    /** 分类封面 */
    @Excel(name = "分类封面")
    private String categoryCover;

    public void setMerCategoryId(Integer merCategoryId) 
    {
        this.merCategoryId = merCategoryId;
    }

    public Integer getMerCategoryId() 
    {
        return merCategoryId;
    }
    public void setCategoryName(String categoryName) 
    {
        this.categoryName = categoryName;
    }

    public String getCategoryName() 
    {
        return categoryName;
    }
    public void setCategoryDescription(String categoryDescription) 
    {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryDescription() 
    {
        return categoryDescription;
    }
    public void setCategoryCover(String categoryCover) 
    {
        this.categoryCover = categoryCover;
    }

    public String getCategoryCover() 
    {
        return categoryCover;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("merCategoryId", getMerCategoryId())
            .append("categoryName", getCategoryName())
            .append("categoryDescription", getCategoryDescription())
            .append("categoryCover", getCategoryCover())
            .toString();
    }
}
