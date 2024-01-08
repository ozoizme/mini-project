package com.ajy.adventure.member.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajy.adventure.member.model.service.MemberService;
import com.ajy.adventure.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService = null;
	
	@PostMapping("insert.me")
	public ResponseEntity<String> insertMember(@RequestBody Member member) {
		
		memberService.insertMember(member);
	

		return;
	}
	

}
