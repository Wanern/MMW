package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:31:12
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

