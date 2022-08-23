package com.wanern.mmw.coupon.dao;

import com.wanern.mmw.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:00:46
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
