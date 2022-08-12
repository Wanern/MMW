package com.wanern.mmw.product.dao;

import com.wanern.mmw.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-10 16:30:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
