package kr.co.sinc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

public class OracleConnection {

	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
	private static final String USER = "hr";
	
	private static final String PW = "hr";
	
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try {
			
			Connection con = DriverManager.getConnection(URL, USER, PW);
			System.out.println(con);
			
			
			PreparedStatement ps = con.prepareStatement("select * from sinc_board_tbl");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString("TITLE"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
