package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-10 16:30:29
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

