package Jdb;

import java.sql.*;

public class Jdbcconnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ramakrishna";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);

		String query = "select * from student ";
//		String query ="create database hello";

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + "" + rs.getInt(3) + "" + rs.getString(4));
		}

		rs.close();
		con.close();
		st.close();

	}

}
