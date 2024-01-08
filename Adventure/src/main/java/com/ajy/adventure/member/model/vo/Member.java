package com.ajy.adventure.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Member {
	
	private int memNo; //MEM_NO	NUMBER
	private String memName; //MEM_NAME	VARCHAR2(100 BYTE)
	private String memNickName; //MEM_NICKNAME	VARCHAR2(100 BYTE)
	private String memId; //MEM_ID	VARCHAR2(50 BYTE)
	private String memPwd; //MEM_PWD	VARCHAR2(50 BYTE)
	private String memEmail; //MEM_EMAIL	VARCHAR2(80 BYTE)
	private String memCountry; //MEM_COUNTRY	VARCHAR2(50 BYTE)
	private Date enrollDate; //ENROLL_DATE	DATE
	private char memStatus; //MEM_STATUS	CHAR(1 BYTE)

}
