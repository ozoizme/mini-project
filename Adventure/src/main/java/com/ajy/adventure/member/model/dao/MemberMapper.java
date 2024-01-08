package com.ajy.adventure.member.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;

import com.ajy.adventure.member.model.vo.Member;

@Mapper
public interface MemberMapper {

	int insertMember(Member member, SqlSessionTemplate sqlSession);


}
