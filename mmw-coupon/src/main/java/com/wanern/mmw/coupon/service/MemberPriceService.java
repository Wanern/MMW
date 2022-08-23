package com.wanern.mmw.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:00:46
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

