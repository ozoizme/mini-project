package com.ajy.adventure.member.controller;

import java.nio.charset.Charset;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajy.adventure.member.model.service.MemberService;
import com.ajy.adventure.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
	
	@PostMapping("insert.me")
	public ResponseEntity<String> insertMember(@RequestBody Member member) {
		
		String result = memberService.insertMember(member) != 0 ? "success" : "fail";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("text","html", Charset.forName("UTF-8")));
		return new ResponseEntity<String>(result, header, HttpStatus.OK);
	}
	
	@PostMapping("/checkPassword")
	public ResponseEntity<String> checkPassword(@RequestBody String memberPwd){
		String result = memberService.checkPassword(memberPwd) != 0 ? "success" : "fail";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("text","html", Charset.forName("UTF-8")));
		return new ResponseEntity<String>(result, header, HttpStatus.OK);
	}
	
	

}
