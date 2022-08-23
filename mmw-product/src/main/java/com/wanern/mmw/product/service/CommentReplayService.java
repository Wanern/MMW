package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:31:12
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

