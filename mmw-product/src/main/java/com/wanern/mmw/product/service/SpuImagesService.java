package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.common.utils.PageUtils;
import com.wanern.mmw.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-10 16:30:28
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
