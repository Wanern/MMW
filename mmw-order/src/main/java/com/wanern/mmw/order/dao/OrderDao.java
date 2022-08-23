package com.wanern.mmw.order.dao;

import com.wanern.mmw.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:24:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
