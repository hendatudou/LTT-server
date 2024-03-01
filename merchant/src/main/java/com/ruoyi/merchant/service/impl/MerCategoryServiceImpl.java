package com.ruoyi.merchant.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.merchant.mapper.MerCategoryMapper;
import com.ruoyi.merchant.domain.MerCategory;
import com.ruoyi.merchant.service.IMerCategoryService;

/**
 * 商户分类Service业务层处理
 * 
 * @author hendatudou
 * @date 2024-02-28
 */
@Service
public class MerCategoryServiceImpl implements IMerCategoryService 
{
    @Autowired
    private MerCategoryMapper merCategoryMapper;

    /**
     * 查询商户分类
     * 
     * @param merCategoryId 商户分类主键
     * @return 商户分类
     */
    @Override
    public MerCategory selectMerCategoryByMerCategoryId(Integer merCategoryId)
    {
        return merCategoryMapper.selectMerCategoryByMerCategoryId(merCategoryId);
    }

    /**
     * 查询商户分类列表
     * 
     * @param merCategory 商户分类
     * @return 商户分类
     */
    @Override
    public List<MerCategory> selectMerCategoryList(MerCategory merCategory)
    {
        return merCategoryMapper.selectMerCategoryList(merCategory);
    }

    /**
     * 新增商户分类
     * 
     * @param merCategory 商户分类
     * @return 结果
     */
    @Override
    public int insertMerCategory(MerCategory merCategory)
    {
        return merCategoryMapper.insertMerCategory(merCategory);
    }

    /**
     * 修改商户分类
     * 
     * @param merCategory 商户分类
     * @return 结果
     */
    @Override
    public int updateMerCategory(MerCategory merCategory)
    {
        return merCategoryMapper.updateMerCategory(merCategory);
    }

    /**
     * 批量删除商户分类
     * 
     * @param merCategoryIds 需要删除的商户分类主键
     * @return 结果
     */
    @Override
    public int deleteMerCategoryByMerCategoryIds(Integer[] merCategoryIds)
    {
        return merCategoryMapper.deleteMerCategoryByMerCategoryIds(merCategoryIds);
    }

    /**
     * 删除商户分类信息
     * 
     * @param merCategoryId 商户分类主键
     * @return 结果
     */
    @Override
    public int deleteMerCategoryByMerCategoryId(Integer merCategoryId)
    {
        return merCategoryMapper.deleteMerCategoryByMerCategoryId(merCategoryId);
    }
}
