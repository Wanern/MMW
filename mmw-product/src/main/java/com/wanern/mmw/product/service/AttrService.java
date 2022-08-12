package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.common.utils.PageUtils;
import com.wanern.mmw.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-10 16:30:29
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

