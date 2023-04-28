package edu.kh.comm.member.model.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyPageDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	/** 회원정보수정 DAO
	 * @param paramMap
	 * @return
	 */
	public int updateInfo(Map<String, Object> paramMap) {
		
		return sqlSession.update("myPageMapper.updateInfo", paramMap);
	}

	/** 현재 로그인한 회원의 암호화된 비밀번호 조회 DAO
	 * @param memberNo
	 * @return
	 */
	public String selectEncPw(int memberNo) {
		
		return sqlSession.selectOne("myPageMapper.selectEncPw",memberNo);
	}

	public int changePw(Map<String, Object> paramMap) {
		
		return sqlSession.update("myPageMapper.changcPw",paramMap);
	}

	/** 회원탈퇴 DAO
	 * @param memberNo
	 * @return
	 */
	public int secession(int memberNo) {
		
		return sqlSession.update("myPagemapper.secession", memberNo);
	}

	/** 프로필 이미지 수정
	 * @param map
	 * @return
	 */
	public int updateProfile(Map<String, Object> map) {
		
		return sqlSession.update("myPageMapper.updateProfile", map);
	}

}
