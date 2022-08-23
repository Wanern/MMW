package com.wanern.mmw.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:14:43
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

