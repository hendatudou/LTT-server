package com.ruoyi.merchant.mapper;

import java.util.List;
import com.ruoyi.merchant.domain.MerCategory;

/**
 * 商户分类Mapper接口
 * 
 * @author hendatudou
 * @date 2024-02-28
 */
public interface MerCategoryMapper 
{
    /**
     * 查询商户分类
     * 
     * @param merCategoryId 商户分类主键
     * @return 商户分类
     */
    public MerCategory selectMerCategoryByMerCategoryId(Integer merCategoryId);

    /**
     * 查询商户分类列表
     * 
     * @param merCategory 商户分类
     * @return 商户分类集合
     */
    public List<MerCategory> selectMerCategoryList(MerCategory merCategory);

    /**
     * 新增商户分类
     * 
     * @param merCategory 商户分类
     * @return 结果
     */
    public int insertMerCategory(MerCategory merCategory);

    /**
     * 修改商户分类
     * 
     * @param merCategory 商户分类
     * @return 结果
     */
    public int updateMerCategory(MerCategory merCategory);

    /**
     * 删除商户分类
     * 
     * @param merCategoryId 商户分类主键
     * @return 结果
     */
    public int deleteMerCategoryByMerCategoryId(Integer merCategoryId);

    /**
     * 批量删除商户分类
     * 
     * @param merCategoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMerCategoryByMerCategoryIds(Integer[] merCategoryIds);
}
