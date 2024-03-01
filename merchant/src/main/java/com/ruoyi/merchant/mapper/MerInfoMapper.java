package com.ruoyi.merchant.mapper;

import java.util.List;
import com.ruoyi.merchant.domain.MerInfo;

/**
 * 商户信息Mapper接口
 * 
 * @author hendatudou
 * @date 2024-02-29
 */
public interface MerInfoMapper 
{
    /**
     * 查询商户信息
     * 
     * @param merchantId 商户信息主键
     * @return 商户信息
     */
    public MerInfo selectMerInfoByMerchantId(Long merchantId);

    /**
     * 查询商户信息列表
     * 
     * @param merInfo 商户信息
     * @return 商户信息集合
     */
    public List<MerInfo> selectMerInfoList(MerInfo merInfo);

    /**
     * 新增商户信息
     * 
     * @param merInfo 商户信息
     * @return 结果
     */
    public int insertMerInfo(MerInfo merInfo);

    /**
     * 修改商户信息
     * 
     * @param merInfo 商户信息
     * @return 结果
     */
    public int updateMerInfo(MerInfo merInfo);

    /**
     * 删除商户信息
     * 
     * @param merchantId 商户信息主键
     * @return 结果
     */
    public int deleteMerInfoByMerchantId(Long merchantId);

    /**
     * 批量删除商户信息
     * 
     * @param merchantIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMerInfoByMerchantIds(Long[] merchantIds);
}
