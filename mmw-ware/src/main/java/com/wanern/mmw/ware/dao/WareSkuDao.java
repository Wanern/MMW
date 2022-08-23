package com.wanern.mmw.ware.dao;

import com.wanern.mmw.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:36:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
