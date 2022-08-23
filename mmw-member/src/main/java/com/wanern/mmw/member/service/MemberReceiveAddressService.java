package com.wanern.mmw.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:14:43
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

