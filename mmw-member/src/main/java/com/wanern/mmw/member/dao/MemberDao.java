package com.wanern.mmw.member.dao;

import com.wanern.mmw.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Ale
 * @email qingchenorg@163.com
 * @date 2022-08-23 14:14:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
