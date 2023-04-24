package edu.kh.comm.member.model.service;

import edu.kh.comm.member.model.vo.Member;

/* Service Interface를 사용하는 이유
 * 
 * 1. 프로젝트에 규칙성을 부여하기 위해서
 * 
 * 2. Spring AOP를 위해서 필요
 * 
 * 3. 클래스간의 결합도를 약화 시키기 위해서 -> 유지보수성 향상
 * 
 */

/*
 * 흩어진 관심사: 소스코드상에서 계속 반복해서 사용되는 부분들
 * ---> 유지보수를 어렵게 만든다.
 * 
 */


public interface MemberService { 
	// 모든 메서드가 추상 메소드(묵시적으로 public abstract)
	// 모든 필드는 상수 (묵시적으로 public static final)
	
	
//로그인 서비스
 public abstract Member login(Member inputMember); 
 
}
