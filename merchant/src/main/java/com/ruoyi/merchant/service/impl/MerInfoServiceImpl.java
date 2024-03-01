package com.ruoyi.merchant.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.merchant.mapper.MerInfoMapper;
import com.ruoyi.merchant.domain.MerInfo;
import com.ruoyi.merchant.service.IMerInfoService;

/**
 * 商户信息Service业务层处理
 * 
 * @author hendatudou
 * @date 2024-02-29
 */
@Service
public class MerInfoServiceImpl implements IMerInfoService 
{
    @Autowired
    private MerInfoMapper merInfoMapper;

    /**
     * 查询商户信息
     * 
     * @param merchantId 商户信息主键
     * @return 商户信息
     */
    @Override
    public MerInfo selectMerInfoByMerchantId(Long merchantId)
    {
        return merInfoMapper.selectMerInfoByMerchantId(merchantId);
    }

    /**
     * 查询商户信息列表
     * 
     * @param merInfo 商户信息
     * @return 商户信息
     */
    @Override
    public List<MerInfo> selectMerInfoList(MerInfo merInfo)
    {
        return merInfoMapper.selectMerInfoList(merInfo);
    }

    /**
     * 新增商户信息
     * 
     * @param merInfo 商户信息
     * @return 结果
     */
    @Override
    public int insertMerInfo(MerInfo merInfo)
    {
        return merInfoMapper.insertMerInfo(merInfo);
    }

    /**
     * 修改商户信息
     * 
     * @param merInfo 商户信息
     * @return 结果
     */
    @Override
    public int updateMerInfo(MerInfo merInfo)
    {
        return merInfoMapper.updateMerInfo(merInfo);
    }

    /**
     * 批量删除商户信息
     * 
     * @param merchantIds 需要删除的商户信息主键
     * @return 结果
     */
    @Override
    public int deleteMerInfoByMerchantIds(Long[] merchantIds)
    {
        return merInfoMapper.deleteMerInfoByMerchantIds(merchantIds);
    }

    /**
     * 删除商户信息信息
     * 
     * @param merchantId 商户信息主键
     * @return 结果
     */
    @Override
    public int deleteMerInfoByMerchantId(Long merchantId)
    {
        return merInfoMapper.deleteMerInfoByMerchantId(merchantId);
    }
}
