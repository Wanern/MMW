package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:31:11
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

