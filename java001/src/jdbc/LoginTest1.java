package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class LoginTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id : "); String userid = sc.nextLine();
		System.out.print("pw : "); String userpw = DigestUtils.sha512Hex(sc.nextLine());
		
		String sql = 
			    "SELECT userid, name " +
			    "FROM members " + 
			    "WHERE userid=? and userpw=?";
		
		try (Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521/xepdb1","ace","ace");
				PreparedStatement stmt = conn.prepareStatement(sql)){
			
				stmt.setString(1, userid);
				stmt.setString(2, userpw);
		
				try (ResultSet rs = stmt.executeQuery()){		
			
					if(rs.next()) {
						System.out.print(rs.getString("name") + "(" + 
								rs.getString("userid") + ")님이 로그인 하였습니다.");
					} else {
						System.out.println("아이디 혹은 비번이 틀립니다.");
					}
				}
			System.out.println("connection success");
		} catch (Exception e) {
			System.out.println("connection fail" + e.getMessage());
			// TODO: handle exception
		}
		System.out.println("end..");
	}
}
