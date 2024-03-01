package com.ruoyi.web.controller.merchant;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.merchant.domain.MerCategory;
import com.ruoyi.merchant.service.IMerCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 商户分类Controller
 * 
 * @author hendatudou
 * @date 2024-02-28
 */
@RestController
@RequestMapping("/merchant/category")
public class MerCategoryController extends BaseController
{
    @Autowired
    private IMerCategoryService merCategoryService;

    /**
     * 查询商户分类列表
     */
    @PreAuthorize("@ss.hasPermi('merchant:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(MerCategory merCategory)
    {
        startPage();
        List<MerCategory> list = merCategoryService.selectMerCategoryList(merCategory);
        return getDataTable(list);
    }

    /**
     * 导出商户分类列表
     */
    @PreAuthorize("@ss.hasPermi('merchant:category:export')")
    @Log(title = "商户分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MerCategory merCategory)
    {
        List<MerCategory> list = merCategoryService.selectMerCategoryList(merCategory);
        ExcelUtil<MerCategory> util = new ExcelUtil<MerCategory>(MerCategory.class);
        util.exportExcel(response, list, "商户分类数据");
    }

    /**
     * 获取商户分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('merchant:category:query')")
    @GetMapping(value = "/{merCategoryId}")
    public AjaxResult getInfo(@PathVariable("merCategoryId") Integer merCategoryId)
    {
        return success(merCategoryService.selectMerCategoryByMerCategoryId(merCategoryId));
    }

    /**
     * 新增商户分类
     */
    @PreAuthorize("@ss.hasPermi('merchant:category:add')")
    @Log(title = "商户分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MerCategory merCategory)
    {
        return toAjax(merCategoryService.insertMerCategory(merCategory));
    }

    /**
     * 修改商户分类
     */
    @PreAuthorize("@ss.hasPermi('merchant:category:edit')")
    @Log(title = "商户分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MerCategory merCategory)
    {
        return toAjax(merCategoryService.updateMerCategory(merCategory));
    }

    /**
     * 删除商户分类
     */
    @PreAuthorize("@ss.hasPermi('merchant:category:remove')")
    @Log(title = "商户分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{merCategoryIds}")
    public AjaxResult remove(@PathVariable Integer[] merCategoryIds)
    {
        return toAjax(merCategoryService.deleteMerCategoryByMerCategoryIds(merCategoryIds));
    }
}
