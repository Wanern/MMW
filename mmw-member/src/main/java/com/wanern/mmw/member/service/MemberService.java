package com.wanern.mmw.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:14:43
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

