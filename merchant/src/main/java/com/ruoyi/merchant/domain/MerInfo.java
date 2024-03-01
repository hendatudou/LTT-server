package com.ruoyi.merchant.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商户信息对象 mer_info
 * 
 * @author hendatudou
 * @date 2024-02-29
 */
public class MerInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商户编码 */
    private Long merchantId;

    /** 商户分类编码 */
    @Excel(name = "商户分类编码")
    private Integer merchantCategoryId;

    /** 商户名称 */
    @Excel(name = "商户名称")
    private String merchantName;

    /** 位置 */
    private String merchantLocation;

    /** 资质 */
    private String merchantQualification;

    /** 营业时间 */
    private String merchantOpeningHours;

    /** 认证状态 */
    @Excel(name = "认证状态")
    private Integer merchantCertificationStatus;

    /** 营业状态 */
    @Excel(name = "营业状态")
    private Integer merchantOpeningStatus;

    /** 电话 */
    @Excel(name = "电话")
    private String merchantPhone;

    /** 图集 */
    private String merchantImages;

    /** 负责人ID */
    @Excel(name = "负责人ID")
    private Long merchantCommanderId;

    public void setMerchantId(Long merchantId) 
    {
        this.merchantId = merchantId;
    }

    public Long getMerchantId() 
    {
        return merchantId;
    }
    public void setMerchantCategoryId(Integer merchantCategoryId) 
    {
        this.merchantCategoryId = merchantCategoryId;
    }

    public Integer getMerchantCategoryId() 
    {
        return merchantCategoryId;
    }
    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }
    public void setMerchantLocation(String merchantLocation) 
    {
        this.merchantLocation = merchantLocation;
    }

    public String getMerchantLocation() 
    {
        return merchantLocation;
    }
    public void setMerchantQualification(String merchantQualification) 
    {
        this.merchantQualification = merchantQualification;
    }

    public String getMerchantQualification() 
    {
        return merchantQualification;
    }
    public void setMerchantOpeningHours(String merchantOpeningHours) 
    {
        this.merchantOpeningHours = merchantOpeningHours;
    }

    public String getMerchantOpeningHours() 
    {
        return merchantOpeningHours;
    }
    public void setMerchantCertificationStatus(Integer merchantCertificationStatus) 
    {
        this.merchantCertificationStatus = merchantCertificationStatus;
    }

    public Integer getMerchantCertificationStatus() 
    {
        return merchantCertificationStatus;
    }
    public void setMerchantOpeningStatus(Integer merchantOpeningStatus) 
    {
        this.merchantOpeningStatus = merchantOpeningStatus;
    }

    public Integer getMerchantOpeningStatus() 
    {
        return merchantOpeningStatus;
    }
    public void setMerchantPhone(String merchantPhone) 
    {
        this.merchantPhone = merchantPhone;
    }

    public String getMerchantPhone() 
    {
        return merchantPhone;
    }
    public void setMerchantImages(String merchantImages) 
    {
        this.merchantImages = merchantImages;
    }

    public String getMerchantImages() 
    {
        return merchantImages;
    }
    public void setMerchantCommanderId(Long merchantCommanderId) 
    {
        this.merchantCommanderId = merchantCommanderId;
    }

    public Long getMerchantCommanderId() 
    {
        return merchantCommanderId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("merchantId", getMerchantId())
            .append("merchantCategoryId", getMerchantCategoryId())
            .append("merchantName", getMerchantName())
            .append("merchantLocation", getMerchantLocation())
            .append("merchantQualification", getMerchantQualification())
            .append("merchantOpeningHours", getMerchantOpeningHours())
            .append("merchantCertificationStatus", getMerchantCertificationStatus())
            .append("merchantOpeningStatus", getMerchantOpeningStatus())
            .append("merchantPhone", getMerchantPhone())
            .append("merchantImages", getMerchantImages())
            .append("merchantCommanderId", getMerchantCommanderId())
            .toString();
    }
}
