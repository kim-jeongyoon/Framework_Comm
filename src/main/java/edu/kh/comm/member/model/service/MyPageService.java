package edu.kh.comm.member.model.service;

import java.io.IOException;
import java.util.Map;

import edu.kh.comm.member.model.vo.Member;

public interface MyPageService {

	/** 회원정보수정 서비스
	 * @param paramMap
	 * @return
	 */
	int updateInfo(Map<String, Object> paramMap);

	int chagePw(Map<String, Object> paramMap);

	/** 회원 탈퇴 서비스
	 * @param loginMember
	 * @return
	 */
	int secession(Member loginMember);

	int updateProfile(Map<String, Object> map) throws IOException;

}
