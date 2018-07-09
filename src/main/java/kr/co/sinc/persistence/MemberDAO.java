package kr.co.sinc.persistence;

import kr.co.sinc.vo.MemberVO;

public interface MemberDAO {

	public String getTime();
	public void insertMember(MemberVO vo);
	
}
