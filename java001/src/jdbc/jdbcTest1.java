package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbcTest1 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT employee_id, last_name, salary FROM employees";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1","ace","ace");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("employee_id") + "\t");
				System.out.print(rs.getString("last_name") + "\t");
				System.out.print(rs.getLong("salary") + "\n");
			}
			System.out.println("connection success");
		} catch (Exception e) {
			System.out.println("connection fail" + e.getMessage());
			// TODO: handle exception
		} finally {
			if (rs != null ) try {rs.close();} catch(Exception e) {}
			if (stmt != null) try {rs.close();} catch(Exception e) {}
			if (conn != null ) try {rs.close();} catch(Exception e) {}
		}
		System.out.println("end..");
	}
}
