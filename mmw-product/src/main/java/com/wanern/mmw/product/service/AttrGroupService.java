package com.wanern.mmw.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-10 16:30:29
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

