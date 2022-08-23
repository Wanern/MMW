package com.wanern.mmw.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:24:35
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

