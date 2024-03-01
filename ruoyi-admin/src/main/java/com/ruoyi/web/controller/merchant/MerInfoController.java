package com.ruoyi.web.controller.merchant;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.merchant.domain.MerInfo;
import com.ruoyi.merchant.service.IMerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 商户信息Controller
 * 
 * @author hendatudou
 * @date 2024-02-29
 */
@RestController
@RequestMapping("/merchant/info")
public class MerInfoController extends BaseController
{
    @Autowired
    private IMerInfoService merInfoService;

    /**
     * 查询商户信息列表
     */
    @PreAuthorize("@ss.hasPermi('merchant:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(MerInfo merInfo)
    {
        startPage();
        List<MerInfo> list = merInfoService.selectMerInfoList(merInfo);
        return getDataTable(list);
    }

    /**
     * 导出商户信息列表
     */
    @PreAuthorize("@ss.hasPermi('merchant:info:export')")
    @Log(title = "商户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MerInfo merInfo)
    {
        List<MerInfo> list = merInfoService.selectMerInfoList(merInfo);
        ExcelUtil<MerInfo> util = new ExcelUtil<MerInfo>(MerInfo.class);
        util.exportExcel(response, list, "商户信息数据");
    }

    /**
     * 获取商户信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('merchant:info:query')")
    @GetMapping(value = "/{merchantId}")
    public AjaxResult getInfo(@PathVariable("merchantId") Long merchantId)
    {
        return success(merInfoService.selectMerInfoByMerchantId(merchantId));
    }

    /**
     * 新增商户信息
     */
    @PreAuthorize("@ss.hasPermi('merchant:info:add')")
    @Log(title = "商户信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MerInfo merInfo)
    {
        return toAjax(merInfoService.insertMerInfo(merInfo));
    }

    /**
     * 修改商户信息
     */
    @PreAuthorize("@ss.hasPermi('merchant:info:edit')")
    @Log(title = "商户信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MerInfo merInfo)
    {
        return toAjax(merInfoService.updateMerInfo(merInfo));
    }

    /**
     * 删除商户信息
     */
    @PreAuthorize("@ss.hasPermi('merchant:info:remove')")
    @Log(title = "商户信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{merchantIds}")
    public AjaxResult remove(@PathVariable Long[] merchantIds)
    {
        return toAjax(merInfoService.deleteMerInfoByMerchantIds(merchantIds));
    }
}
