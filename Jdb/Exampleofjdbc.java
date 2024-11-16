package Jdb;

import java.sql.*;

public class Exampleofjdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);

		String query = "select * from kings ";
//		String query ="create database hello";

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + "" + rs.getLong(3));
		}

		rs.close();
		con.close();
		st.close();

	}

}
