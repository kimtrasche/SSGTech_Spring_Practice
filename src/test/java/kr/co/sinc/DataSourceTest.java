package kr.co.sinc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	// 이게 Jnuit으로 실행할 놈이라는 의미
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})	// 설정파일 올려야함.
public class DataSourceTest {
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception{
		
	
		Connection con = ds.getConnection();
		System.out.println(con);
		
		
		PreparedStatement ps = con.prepareStatement("select * from sinc_board_tbl");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getString("TITLE"));
		}
	}
}
