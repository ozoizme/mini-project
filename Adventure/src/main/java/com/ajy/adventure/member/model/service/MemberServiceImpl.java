package com.ajy.adventure.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.ajy.adventure.member.model.dao.MemberMapper;
import com.ajy.adventure.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	private final MemberMapper memberMapper;
	private final SqlSessionTemplate sqlSession;
	
	@Override
	public int insertMember(Member member) {
		return memberMapper.insertMember(member, sqlSession);
	}

	@Override
	public int checkPassword(String memberPwd) {
		return memberMapper.checkPassword(memberPwd, sqlSession);
	}

}
