package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:31:11
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

