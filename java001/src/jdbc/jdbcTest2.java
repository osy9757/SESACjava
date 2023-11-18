package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbcTest2 {
	public static void main(String[] args) {
		
		String sql = "SELECT employee_id, last_name, salary FROM employees";
		
		try (Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521/xepdb1","ace","ace");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){			
			
			while(rs.next()) {
				System.out.print(rs.getInt("employee_id") + "\t");
				System.out.print(rs.getString("last_name") + "\t");
				System.out.print(rs.getLong("salary") + "\n");
			}
			System.out.println("connection success");
		} catch (Exception e) {
			System.out.println("connection fail" + e.getMessage());
			// TODO: handle exception
		}
		System.out.println("end..");
	}
}
