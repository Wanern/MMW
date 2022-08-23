package com.wanern.mmw.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:36:21
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

