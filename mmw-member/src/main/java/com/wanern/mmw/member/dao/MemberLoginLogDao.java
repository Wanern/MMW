package com.wanern.mmw.member.dao;

import com.wanern.mmw.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:14:43
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
