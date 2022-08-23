package com.wanern.mmw.coupon.dao;

import com.wanern.mmw.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:00:47
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
