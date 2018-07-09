package kr.co.sinc;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sinc.persistence.MemberDAO;
import kr.co.sinc.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void insertMember() throws Exception{
		/*
		MemberVO vo = new MemberVO();
		vo.setUserid("171928");
		vo.setUserpw("111111");
		vo.setUsername("KyungTae Kim");
		vo.setEmail("171928@shinseage.com");
		
		dao.insertMember(vo);
		*/
	}
	
}
