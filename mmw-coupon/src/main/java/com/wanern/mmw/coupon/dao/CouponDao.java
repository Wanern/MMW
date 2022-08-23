package com.wanern.mmw.coupon.dao;

import com.wanern.mmw.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:00:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
